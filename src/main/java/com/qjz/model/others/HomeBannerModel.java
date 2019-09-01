package com.qjz.model.others;

import com.qjz.enums.others.BannerTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 首页轮播图
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/28 13:06
 **/
@Setter
@Getter
@Accessors(chain = true)
@ApiModel("首页轮播图")
public class HomeBannerModel {
    @ApiModelProperty("图片")
    private String img;
    @ApiModelProperty("链接")
    private Integer url;
    @ApiModelProperty("类型")
    private BannerTypeEnum type;
    @ApiModelProperty("额外数据")
    private String extra;
}
