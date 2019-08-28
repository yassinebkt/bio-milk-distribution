package com.bkt.biomilkdistribution.services;

import com.bkt.biomilkdistribution.web.model.MilkDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MilkServiceImpl implements MilkService {
    @Override
    public MilkDto getMilkById(UUID milkId) {
        return MilkDto.builder().id(UUID.randomUUID())
                .milkName("Glaxy Cat")
                .milkStyle("Pale ALe")
                .build();
    }

    @Override
    public MilkDto saveNewMilk(MilkDto milkDto) {
        return MilkDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
}
