package com.qjz.controller.app;

import com.fanglin.common.core.others.Ajax;
import com.qjz.core.others.Page;
import com.qjz.core.others.RowBounds;
import com.qjz.model.post.HomePostListModel;
import com.qjz.model.post.HomePostSearchModel;
import com.qjz.service.app.AppPostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 职位
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
@RestController
@RequestMapping("/app/post/")
@Api(value = "/app/post/", tags = {"APP", "APP职位"})
public class AppPostController {

    @Autowired
    AppPostService postService;

    @ApiOperation("首页岗位列表")
    @PostMapping("homePostList")
    public Ajax<List<HomePostListModel>> homePostList(HomePostSearchModel search, RowBounds page) {
        return Ajax.ok(postService.homePostList(search, page));
    }

}
