package com.qjz.mapper;

import com.qjz.entity.others.IndustryCategoryEntity;
import com.qjz.enums.post.PostTypeEnum;
import com.qjz.model.others.IndustryCategoryCacheModel;
import com.qjz.model.others.IndustryCategoryTreeModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;


/**
 * 行业分类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
public interface IndustryCategoryMapper extends Mapper<IndustryCategoryEntity> {

    /**
     * 行业分类树
     *
     * @param type
     * @return
     */
    List<IndustryCategoryTreeModel> industryCategoryTree(@Param("type") PostTypeEnum type);

    /**
     * 行业分类缓存
     *
     * @return
     */
    @Select("select id,name from industry_category")
    List<Map<String, Object>> industryCategoryCache();
}
