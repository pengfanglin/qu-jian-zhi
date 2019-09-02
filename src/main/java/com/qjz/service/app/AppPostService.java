package com.qjz.service.app;

import com.qjz.core.others.RowBounds;
import com.qjz.model.post.HomePostListModel;
import com.qjz.model.post.HomePostSearchModel;

import java.util.List;

/**
 * 职位 服务类
 *
 * @author 彭方林
 * @date 2019-08-31
 */
public interface AppPostService {

    /**
     * 首页职位列表
     *
     * @param search
     * @return
     */
    List<HomePostListModel> homePostList(HomePostSearchModel search, RowBounds page);
}
