package com.qjz.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 通用mapper的总仓库
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:34
 **/
@Component
public class MapperFactory {
    @Autowired
    public OthersMapper others;
    @Autowired
    public UserMapper user;
    @Autowired
    public ServiceCityMapper serviceCity;
    @Autowired
    public RegionMapper region;
    @Autowired
    public BannerMapper banner;
    @Autowired
    public IndustryCategoryMapper industryCategory;
    @Autowired
    public PostMapper post;
    @Autowired
    public PostAddressMapper postAddress;
}
