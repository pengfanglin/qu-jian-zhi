package com.qjz.enums.post;

import com.fanglin.common.core.enums.CodeEnum;
import lombok.Getter;

/**
 * 职位类型
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/30 23:58
 **/
public enum PostTypeEnum implements CodeEnum {

    /**
     * 兼职
     */
    PART(0),
    /**
     * 全职
     */
    FULL(1),
    /**
     * 实习
     */
    INTERNSHIP(2);

    @Getter
    private int code;

    PostTypeEnum(int code) {
        this.code = code;
    }
}
