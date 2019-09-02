package com.qjz.model.post;

import com.qjz.enums.others.EducationEnum;
import com.qjz.enums.post.PostOrderEnum;
import com.qjz.enums.post.PostTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 首页岗位搜索
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/30 21:20
 **/
@Setter
@Getter
@Accessors(chain = true)
@ApiModel("首页岗位搜索")
public class HomePostSearchModel {
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("类型")
    private PostTypeEnum type;
    @ApiModelProperty("最小薪资")
    private Integer minPrice;
    @ApiModelProperty("最大薪资")
    private Integer maxPrice;
    @ApiModelProperty("学历")
    private EducationEnum education;
    @ApiModelProperty("区域")
    private String area;
    @ApiModelProperty("分类")
    private Integer category;
    @ApiModelProperty("排序")
    private PostOrderEnum order;
    @ApiModelProperty("经度")
    private Double lng;
    @ApiModelProperty("纬度")
    private Double lat;
    @ApiModelProperty("城市编码")
    private Integer city;
}
