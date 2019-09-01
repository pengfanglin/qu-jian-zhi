package com.qjz.entity.others;

import com.qjz.enums.others.BannerTypeEnum;
import lombok.Data;
import lombok.experimental.Accessors;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 轮播图
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/30 22:34
 **/
@Data
@Accessors(chain = true)
@Table(name = "banner")
public class BannerEntity {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    /**
     * 图片
     */
    private String img;
    /**
     * url路径
     */
    private String url;
    /**
     * 轮播图类型
     */
    private BannerTypeEnum type;
    /**
     * 额外数据
     */
    private String extra;
    /**
     * 权重
     */
    private Float sort;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建时间
     */
    private Date updateTime;
}
