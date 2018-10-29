package com.xiaoyutech.ms.service;

import com.xiaoyutech.ms.domain.City;

import java.util.List;

public interface CityService {

    City getByProvinceId(Long provinceId);

    List<City> getAll();

}
