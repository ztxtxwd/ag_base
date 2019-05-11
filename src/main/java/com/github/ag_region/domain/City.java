package com.github.ag_region.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
@Data
@ToString
public class City extends Region{
    private Long cityId;
    private String cityName;
}
