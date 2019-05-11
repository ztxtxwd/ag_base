package com.github.ag_region.dao;

import com.github.ag_region.domain.*;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface RegionMapper {
    @Select("SELECT province_name,province_id from mx_sn_jilian GROUP BY province_name,province_id;")

    @Results({
            @Result(column="province_id", property="provinceId", jdbcType= JdbcType.INTEGER),
            @Result(column ="province_name",property = "provinceName",jdbcType = JdbcType.VARCHAR)
    })
    List<Province> getProvinces();

    @Select("SELECT city_name,city_id  from mx_sn_jilian WHERE province_id = #{provinceId} GROUP BY city_name,city_id;")
    @Results({
            @Result(column="city_id", property="cityId", jdbcType= JdbcType.INTEGER),
            @Result(column ="city_name",property = "cityName",jdbcType = JdbcType.VARCHAR)
    })
    List<City> getCities(Long provinceId);
    @Select("SELECT country_name,country_id  from mx_sn_jilian WHERE city_id = #{cityId} GROUP BY country_name,country_id;")
    @Results({
            @Result(column="country_id", property="countryId", jdbcType= JdbcType.INTEGER),
            @Result(column ="country_name",property = "countryName",jdbcType = JdbcType.VARCHAR)
    })
    List<Country> getCountries(Long cityId);
    @Select("SELECT town_name,town_id  from mx_sn_jilian WHERE country_id = #{countryId} GROUP BY town_name,town_id;")
    @Results({
            @Result(column="town_id", property="townId", jdbcType= JdbcType.INTEGER),
            @Result(column ="town_name",property = "townName",jdbcType = JdbcType.VARCHAR)
    })
    List<Town> getTowns(Long townId);
    @Select("SELECT village_name,village_id  from mx_sn_jilian WHERE town_id = #{townId} GROUP BY village_name,village_id;")
    @Results({
            @Result(column="village_id", property="villageId", jdbcType= JdbcType.INTEGER),
            @Result(column ="village_name",property = "villageName",jdbcType = JdbcType.VARCHAR)
    })
    List<Village> getVillages(Long villageId);
}
