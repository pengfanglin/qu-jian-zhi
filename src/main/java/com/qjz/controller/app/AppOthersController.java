package com.qjz.controller.app;

import com.fanglin.common.core.others.Ajax;
import com.qjz.enums.post.PostTypeEnum;
import com.qjz.model.others.HomeBannerModel;
import com.qjz.model.others.IndustryCategoryTreeModel;
import com.qjz.service.app.AppOthersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 其他
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
@RestController
@RequestMapping("/app/others/")
@Api(value = "/app/others/", tags = {"APP", "APP其他"})
public class AppOthersController {

    @Autowired
    AppOthersService appOthersService;

    @ApiOperation("首页轮播图")
    @PostMapping("homeBannerList")
    public Ajax<List<HomeBannerModel>> homeBannerList() {
        return Ajax.ok(appOthersService.homeBannerList());
    }

    @ApiOperation("行业分类树")
    @PostMapping("industryCategoryTree")
    public Ajax<List<IndustryCategoryTreeModel>> industryCategoryTree(PostTypeEnum type) {
        return Ajax.ok(appOthersService.industryCategoryTree(type));
    }
}
