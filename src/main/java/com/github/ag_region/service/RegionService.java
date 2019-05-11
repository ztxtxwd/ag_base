package com.github.ag_region.service;

import com.github.ag_region.dao.RegionMapper;
import com.github.ag_region.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    private RegionMapper regionMapper;

    public List<Province> getProvinces(){
        return regionMapper.getProvinces();
    }
    public List<City> getCities(Long provinceId){
        return regionMapper.getCities(provinceId);
    }
    public List<Country> getCountries(Long cityId){
        return regionMapper.getCountries(cityId);
    }
    public List<Town> getTowns(Long countryId){
        return regionMapper.getTowns(countryId);
    }
    public List<Village> getVillages(Long townId){
        return regionMapper.getVillages(townId);
    }
}
