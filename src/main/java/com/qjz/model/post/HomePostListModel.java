package com.qjz.model.post;

import com.qjz.enums.post.ClearingFormEnum;
import com.qjz.enums.post.PostTypeEnum;
import com.qjz.enums.post.PriceUnitEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 首页岗位列表
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/30 21:20
 **/
@Setter
@Getter
@Accessors(chain = true)
@ApiModel("首页岗位列表")
public class HomePostListModel {
    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("类型")
    private PostTypeEnum type;
    @ApiModelProperty("薪资")
    private Integer price;
    @ApiModelProperty("薪资单位")
    private PriceUnitEnum unit;
    @ApiModelProperty("薪资单位文字")
    private String unitShow;
    @ApiModelProperty("结算方式")
    private ClearingFormEnum clear;
    @ApiModelProperty("结算方式文字")
    private String clearShow;
    @ApiModelProperty("区域")
    private String area;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("分类")
    private String category;
    @ApiModelProperty("地址")
    private Integer distance;

    HomePostListModel setUnit(PriceUnitEnum unit) {
        this.unit = unit;
        this.unitShow = unit.getName();
        return this;
    }

    HomePostListModel setClear(ClearingFormEnum clear) {
        this.clear = clear;
        this.clearShow = clear.getName();
        return this;
    }
}
