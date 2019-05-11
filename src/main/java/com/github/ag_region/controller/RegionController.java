package com.github.ag_region.controller;

import com.github.ag_region.domain.*;
import com.github.ag_region.service.RegionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(description = "城市级联五级联动接口")
@RestController
@RequestMapping("/Snnews")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @ApiOperation(value="获得省份列表",notes="获得省份列表")
    @PostMapping("/get_province")
    public ResponseResult getProvinces(){
        ResponseResult responseResult = new ResponseResult();
        List<Province> provinces = regionService.getProvinces();
        responseResult.setProvincies(provinces);
        return responseResult;
    }
    @ApiOperation(value="获得城市列表",notes="获得城市列表")
    @PostMapping("/get_city/{provinceId}")
    public ResponseResult getCities(@PathVariable("provinceId") Long provinceId){
        ResponseResult responseResult = new ResponseResult();
        List<City> cities = regionService.getCities(provinceId);
        responseResult.setCities(cities);
        return responseResult;
    }
    @ApiOperation(value="获得县区列表",notes="获得县区列表")
    @PostMapping("/get_country/{cityId}")
    public ResponseResult getCountries(@PathVariable("cityId") Long cityId){
        ResponseResult responseResult = new ResponseResult();
        List<Country> countries = regionService.getCountries(cityId);
        responseResult.setCountries(countries);
        return responseResult;
    }
    @ApiOperation(value="获得乡镇列表",notes="获得乡镇列表")
    @PostMapping("/get_town/{countryId}")
    public ResponseResult getTowns(@PathVariable("countryId") Long countryId){
        ResponseResult responseResult = new ResponseResult();
        List<Town> towns = regionService.getTowns(countryId);
        responseResult.setTowns(towns);
        return responseResult;
    }
    @ApiOperation(value="获得村庄列表",notes="获得村庄列表")
    @PostMapping("/get_village/{townId}")
    public ResponseResult getVillages(@PathVariable("townId") Long townId){
        ResponseResult responseResult = new ResponseResult();
        List<Village> villages = regionService.getVillages(townId);
        responseResult.setVillages(villages);
        return responseResult;
    }
}
