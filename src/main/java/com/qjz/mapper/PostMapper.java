package com.qjz.mapper;

import com.qjz.core.others.RowBounds;
import com.qjz.entity.post.PostEntity;
import com.qjz.model.post.HomePostListModel;
import com.qjz.model.post.HomePostSearchModel;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 职位
 *
 * @author 彭方林
 * @date 2019-08-31
 */
public interface PostMapper extends Mapper<PostEntity> {

    /**
     * 首页岗位列表
     *
     * @param search
     * @param page
     * @return
     */
    List<HomePostListModel> homePostList(HomePostSearchModel search, RowBounds page);
}