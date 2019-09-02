package com.qjz.service.app.impl;

import com.fanglin.common.annotation.LocalCache;
import com.qjz.enums.post.PostTypeEnum;
import com.qjz.mapper.MapperFactory;
import com.qjz.model.others.HomeBannerModel;
import com.qjz.model.others.IndustryCategoryCacheModel;
import com.qjz.model.others.IndustryCategoryTreeModel;
import com.qjz.service.app.AppOthersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 其他服务实现类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
@Service
public class AppOthersServiceImpl implements AppOthersService {

    @Autowired
    MapperFactory mapperFactory;

    @Override
    @LocalCache(value = "'homeBannerList'", timeout = 1, unit = TimeUnit.DAYS)
    public List<HomeBannerModel> homeBannerList() {
        return mapperFactory.banner.homeBannerList();
    }

    @Override
    @LocalCache(value = "'industryCategoryTree:'+(#type==null?'':#type)", timeout = 1, unit = TimeUnit.DAYS)
    public List<IndustryCategoryTreeModel> industryCategoryTree(PostTypeEnum type) {
        return mapperFactory.industryCategory.industryCategoryTree(type);
    }

    @Override
    @LocalCache(value = "'industryCategoryCache'", timeout = 1, unit = TimeUnit.DAYS)
    public Map<Integer, String> industryCategoryCache() {
        List<Map<String, Object>> data = mapperFactory.industryCategory.industryCategoryCache();
        Map<Integer, String> cache = new HashMap<>(data.size());
        data.forEach(item -> {
            cache.put(Integer.valueOf(item.get("id").toString()), item.get("name").toString());
        });
        return cache;
    }
}
