package com.qjz.service.app;


import com.qjz.model.city.ServiceCityListModel;

import java.util.List;

/**
 * 地址服务
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/4 10:00
 **/
public interface AddressService {


    /**
     * 服务城市列表
     *
     * @return
     */
    List<ServiceCityListModel> serviceCityList();
}
