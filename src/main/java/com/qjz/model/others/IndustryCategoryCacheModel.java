package com.qjz.model.others;

import com.qjz.enums.post.PostTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 行业分类缓存
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/30 21:20
 **/
@Setter
@Getter
@Accessors(chain = true)
@ApiModel("行业分类缓存")
public class IndustryCategoryCacheModel {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("名称")
    private String name;
}
