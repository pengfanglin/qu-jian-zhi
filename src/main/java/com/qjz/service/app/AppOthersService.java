package com.qjz.service.app;

import com.qjz.enums.post.PostTypeEnum;
import com.qjz.model.others.HomeBannerModel;
import com.qjz.model.others.IndustryCategoryCacheModel;
import com.qjz.model.others.IndustryCategoryTreeModel;

import java.util.List;
import java.util.Map;

/**
 * APP其他服务
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/4 10:00
 **/
public interface AppOthersService {

    /**
     * 首页轮播图
     *
     * @return
     */
    List<HomeBannerModel> homeBannerList();

    /**
     * 行业分类树
     *
     * @return
     */
    List<IndustryCategoryTreeModel> industryCategoryTree(PostTypeEnum type);

    /**
     * 行业分类缓存
     *
     * @return
     */
    Map<Integer,String> industryCategoryCache();
}
