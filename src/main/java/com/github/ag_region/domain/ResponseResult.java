package com.github.ag_region.domain;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class ResponseResult {
    //操作是否成功
    boolean success = true;

    //操作代码
    int code = 10000;

    //提示信息
    String message;

    private List<Province> provincies;
    private List<City> cities;
    private List<Country> countries;
    private List<Town> towns;
    private List<Village> villages;
}
