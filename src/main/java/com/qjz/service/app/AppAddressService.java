package com.qjz.service.app;


import com.qjz.model.city.ServiceCityListModel;
import com.qjz.model.region.RegionTreeModel;

import java.util.List;
import java.util.Map;

/**
 * 地址服务
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/4 10:00
 **/
public interface AppAddressService {


    /**
     * 服务城市列表
     *
     * @return
     */
    List<ServiceCityListModel> serviceCityList();

    /**
     * 区域树
     *
     * @return
     */
    List<RegionTreeModel> regionTree();

    /**
     * 区域缓存
     *
     * @return
     */
    Map<Integer, String> regionCache();
}
