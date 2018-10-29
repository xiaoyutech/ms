package com.xiaoyutech.ms.mapper;

import com.xiaoyutech.ms.domain.City;

import java.util.List;

//@Mapper
public interface CityMapper {
//
//    @Select("select * from city where province_id = #{provinceId}")
//    // 返回结果实体属性与数据库字段转换
//    @Results({
//            @Result(property = "provinceId", column = "province_id"),
//            @Result(property = "cityName", column = "city_name")
//    })
    City findByProvinceId(Long provinceId);

    List<City> findAll();
}