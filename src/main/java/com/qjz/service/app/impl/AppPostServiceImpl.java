package com.qjz.service.app.impl;

import com.qjz.core.others.Page;
import com.qjz.core.others.RowBounds;
import com.qjz.mapper.MapperFactory;
import com.qjz.model.others.IndustryCategoryCacheModel;
import com.qjz.model.post.HomePostListModel;
import com.qjz.model.post.HomePostSearchModel;
import com.qjz.service.app.AppAddressService;
import com.qjz.service.app.AppOthersService;
import com.qjz.service.app.AppPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 职位 服务实现类
 *
 * @author 彭方林
 * @date 2019-08-31
 */
@Service
public class AppPostServiceImpl implements AppPostService {
    @Autowired
    MapperFactory mapperFactory;
    @Autowired
    AppOthersService othersService;
    @Autowired
    AppAddressService addressService;

    @Override
    public List<HomePostListModel> homePostList(HomePostSearchModel search, RowBounds page) {
        List<HomePostListModel> data = mapperFactory.post.homePostList(search, page);
        Map<Integer, String> categories = othersService.industryCategoryCache();
        Map<Integer, String> regions = addressService.regionCache();
        data.forEach(post -> {
            post.setCategory(categories.get(Integer.valueOf(post.getCategory())));
            post.setArea(regions.get(Integer.valueOf(post.getArea())));
        });
        return data;
    }
}
