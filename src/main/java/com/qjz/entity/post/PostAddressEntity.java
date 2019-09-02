package com.qjz.entity.post;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 岗位地址
 *
 * @author 彭方林
 * @date 2019-08-31
 */
@Setter
@Getter
@Accessors(chain = true)
@Table(name = "post_address")
public class PostAddressEntity {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    /**
     * 岗位id
     */
    private Integer postId;

    /**
     * 省
     */
    private Integer province;

    /**
     * 市
     */
    private Integer city;

    /**
     * 区
     */
    private Integer area;

    /**
     * 地址
     */
    private String address;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 纬度
     */
    private Double lat;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;
}
