package com.qjz.mapper;

import com.qjz.entity.others.BannerEntity;
import com.qjz.model.others.HomeBannerModel;
import com.qjz.model.region.RegionTreeModel;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 轮播图
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
public interface BannerMapper extends Mapper<BannerEntity> {

    /**
     * 区域树
     *
     * @return
     */
    @Select("select img,url,type,extra from banner order by sort desc")
    List<HomeBannerModel> homeBannerList();
}
