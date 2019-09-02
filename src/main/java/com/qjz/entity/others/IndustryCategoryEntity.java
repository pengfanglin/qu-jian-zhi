package com.qjz.entity.others;

import com.qjz.enums.post.PostTypeEnum;
import lombok.Data;
import lombok.experimental.Accessors;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 行业分类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/30 22:34
 **/
@Data
@Accessors(chain = true)
@Table(name = "banner")
public class IndustryCategoryEntity {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    /**
     * 父节点id
     */
    private Integer parentId;
    /**
     * 名称
     */
    private String name;
    /**
     * 使用次数
     */
    private Integer hotNum;
    /**
     * 岗位类型
     */
    private PostTypeEnum type;
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
