package com.xiaoyutech.ms.controller;

import com.xiaoyutech.ms.domain.City;
import com.xiaoyutech.ms.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CityRestController {

    @Resource
    private CityService cityService;

    @GetMapping("/cities")
    public List<City> cities () {
        return cityService.getAll();
    }

    @GetMapping("/city/{provinceId}")
    public City city(@PathVariable long provinceId) {
        return cityService.getByProvinceId(provinceId);
    }

}
