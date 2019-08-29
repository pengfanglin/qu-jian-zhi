package com.qjz.entity.others;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Table;
import java.util.Date;

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
@Table(name = "service_city")
public class ServiceCityEntity {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 手机号
     */
    private String name;
    /**
     * 是否禁用
     */
    private Boolean disable;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
