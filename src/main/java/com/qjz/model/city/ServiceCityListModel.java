package com.qjz.model.city;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 服务城市
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/28 13:06
 **/
@Setter
@Getter
@Accessors(chain = true)
@ApiModel("服务城市")
public class ServiceCityListModel {
    @ApiModelProperty("城市名称")
    private String name;
    @ApiModelProperty("首字母")
    private String letter;
    @ApiModelProperty("地区编码")
    private Integer code;
}
