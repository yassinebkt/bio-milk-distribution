package com.bkt.biomilkdistribution.services;

import com.bkt.biomilkdistribution.web.model.MilkDto;

import java.util.UUID;

public interface MilkService {
    MilkDto getMilkById(UUID milkId);

    MilkDto saveNewMilk(MilkDto milkDto);
}
