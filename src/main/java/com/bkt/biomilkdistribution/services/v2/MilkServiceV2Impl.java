package com.bkt.biomilkdistribution.services.v2;

import com.bkt.biomilkdistribution.web.model.v2.MilkDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MilkServiceV2Impl implements MilkServiceV2 {
    @Override
    public MilkDtoV2 getMilkById(UUID milkId) {
        return null;
    }

    @Override
    public MilkDtoV2 saveNewMilk(MilkDtoV2 milkDto) {
        return null;
    }

    @Override
    public void updateMilk(UUID milkId, MilkDtoV2 milkDto) {

    }

    @Override
    public void deleteMilk(UUID milkId) {

    }
}
