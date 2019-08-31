package com.bkt.biomilkdistribution.services.v2;

import com.bkt.biomilkdistribution.web.model.v2.MilkDtoV2;

import java.util.UUID;

public interface MilkServiceV2 {

    MilkDtoV2 getMilkById(UUID milkId);

    MilkDtoV2 saveNewMilk(MilkDtoV2 milkDto);

    void updateMilk(UUID milkId, MilkDtoV2 milkDto);

    void deleteMilk(UUID milkId);
}
