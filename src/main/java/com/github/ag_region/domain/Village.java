package com.github.ag_region.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Village extends Region {
    private Long villageId;
    private String villageName;
}
