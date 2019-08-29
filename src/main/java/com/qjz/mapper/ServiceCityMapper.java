package com.qjz.mapper;

import com.qjz.entity.others.ServiceCityEntity;
import com.qjz.model.city.ServiceCityListModel;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 服务城市
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
public interface ServiceCityMapper extends Mapper<ServiceCityEntity> {

    /**
     * 服务城市列表
     *
     * @return
     */
    @Select("SELECT name,letter FROM service_city ORDER BY letter")
    List<ServiceCityListModel> serviceCityList();
}
