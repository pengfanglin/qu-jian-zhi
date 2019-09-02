package com.qjz.service.app.impl;

import com.fanglin.common.annotation.LocalCache;
import com.qjz.mapper.MapperFactory;
import com.qjz.model.city.ServiceCityListModel;
import com.qjz.model.others.IndustryCategoryCacheModel;
import com.qjz.model.region.RegionTreeModel;
import com.qjz.service.app.AppAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 地址服务实现类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
@Service
public class AppAddressServiceImpl implements AppAddressService {

    @Autowired
    MapperFactory mapperFactory;

    @Override
    @LocalCache(value = "'serviceCityList'", timeout = 1, unit = TimeUnit.DAYS)
    public List<ServiceCityListModel> serviceCityList() {
        return mapperFactory.serviceCity.serviceCityList();
    }

    @Override
    @LocalCache(value = "'regionTree'", timeout = 1, unit = TimeUnit.DAYS)
    public List<RegionTreeModel> regionTree() {
        return mapperFactory.region.regionTree();
    }

    @Override
    @LocalCache(value = "'regionCache'", timeout = 1, unit = TimeUnit.DAYS)
    public Map<Integer, String> regionCache() {
        List<Map<String, Object>> data = mapperFactory.region.regionCache();
        Map<Integer, String> cache = new HashMap<>(data.size());
        data.forEach(item -> {
            cache.put(Integer.valueOf(item.get("code").toString()), item.get("name").toString());
        });
        return cache;
    }
}
