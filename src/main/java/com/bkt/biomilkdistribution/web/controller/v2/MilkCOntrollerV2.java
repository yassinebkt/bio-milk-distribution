package com.bkt.biomilkdistribution.web.controller.v2;


import com.bkt.biomilkdistribution.services.v2.MilkServiceV2;
import com.bkt.biomilkdistribution.web.model.v2.MilkDtoV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v2/milk")
@RestController
class MilkControllerV2 {


    private final MilkServiceV2 milkServiceV2;

    public MilkControllerV2(MilkServiceV2 milkServiceV2) {
        this.milkServiceV2 = milkServiceV2;
    }

    @GetMapping({"/{milkId}"})
    public ResponseEntity<MilkDtoV2> getBeer(@PathVariable("milkId") UUID milkId){
        return new ResponseEntity<>(milkServiceV2.getMilkById(milkId), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity handlePost(@RequestBody MilkDtoV2 milkDtoV2){
        MilkDtoV2 saveDto = milkServiceV2.saveNewMilk(milkDtoV2);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","/api/v1/customer/" + saveDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{milkId}"})
    public ResponseEntity HandleUpdate(@PathVariable("milkId") UUID milkId, @RequestBody MilkDtoV2 milkDtoV2 ){

        milkServiceV2.updateMilk(milkId,milkDtoV2);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{milkId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMilk(@PathVariable("milkId") UUID milkId){
        milkServiceV2.deleteMilk(milkId);
    }


}
