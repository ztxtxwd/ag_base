package com.github.ag_region.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Province extends Region{
    private Long provinceId;
    private String provinceName;
}
