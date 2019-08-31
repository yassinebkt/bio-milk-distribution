package com.bkt.biomilkdistribution.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MilkDtoV2 {

    private UUID id;
    private String milkName;
    private MilkStyleEnum milkStyle;
    private Long upc;
}

