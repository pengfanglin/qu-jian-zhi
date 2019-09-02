package com.qjz.entity.post;

import com.qjz.enums.post.ClearingFormEnum;
import com.qjz.enums.post.PriceUnitEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 职位
 *
 * @author 彭方林
 * @date 2019-08-31
 */
@Setter
@Getter
@Accessors(chain = true)
@Table(name = "post")
public class PostEntity {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 企业id
     */
    private Integer companyId;

    /**
     * 名称
     */
    private String name;

    /**
     * 0-兼职 1-全职 2-实习
     */
    private Integer type;

    /**
     * 0-下架 1-上架 2-平台下架 3-平台永久下架 4-未付款
     */
    private Integer state;

    /**
     * 薪资
     */
    private Integer price;

    /**
     * 薪资单位
     */
    private PriceUnitEnum unit;

    /**
     * 结算方式
     */
    private ClearingFormEnum clear;

    /**
     * 二级分类
     */
    private Integer category;

    /**
     * 一级分类
     */
    private Integer parentCategory;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 刷新时间
     */
    private Date refreshTime;
}
