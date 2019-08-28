package com.qjz.entity.user;

import com.fanglin.common.utils.EncodeUtils;
import com.fanglin.common.utils.OthersUtils;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

/**
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/28 13:06
 **/
@Setter
@Getter
@Accessors(chain = true)
@Table(name = "user")
public class UserEntity {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 手机号
     */
    private Long mobile;
    /**
     * 密码盐值
     */
    private String salt;
    /**
     * 密码
     */
    private String password;
    /**
     * 是否禁用
     */
    private Boolean isDisable;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
