package com.xiaoyutech.ms.service;

import com.xiaoyutech.ms.domain.City;
import com.xiaoyutech.ms.mapper.CityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityMapper cityMapper;

    @Override
    public City getByProvinceId(Long provinceId) {
        return cityMapper.findByProvinceId(provinceId);
    }

    @Override
    public List<City> getAll() {
        return cityMapper.findAll();
    }
}