package com.github.ag_region.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Country extends Region{
    private Long countryId;
    private String countryName;
}
