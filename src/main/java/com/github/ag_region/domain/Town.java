package com.github.ag_region.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Town extends Region{
    private Long townId;
    private String townName;
}
