package com.bkt.biomilkdistribution.services;

import com.bkt.biomilkdistribution.web.model.MilkDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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

    @Override
    public void updateMilk(UUID milkId, MilkDto milkDto) {
        // todo do implement
    }

    @Override
    public void deleteMilk(UUID milkId) {
        log.debug("Deleting milk");
    }
}
