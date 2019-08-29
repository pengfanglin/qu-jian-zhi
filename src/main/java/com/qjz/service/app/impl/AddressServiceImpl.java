package com.qjz.service.app.impl;

import com.fanglin.common.annotation.LocalCache;
import com.qjz.mapper.MapperFactory;
import com.qjz.model.city.ServiceCityListModel;
import com.qjz.service.app.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 地址服务实现类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    MapperFactory mapperFactory;

    @Override
    @LocalCache(value = "'serviceCityList'", timeout = 1, unit = TimeUnit.DAYS)
    public List<ServiceCityListModel> serviceCityList() {
        return mapperFactory.serviceCity.serviceCityList();
    }
}
