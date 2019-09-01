package com.qjz.enums.post;

import com.fanglin.common.core.enums.CodeEnum;
import lombok.Getter;

/**
 * 岗位排序
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/30 23:58
 **/
public enum PostOrderEnum implements CodeEnum {

    /**
     * 默认排序
     */
    DEFAULT(0),
    /**
     * 发布时间
     */
    PUBLISH_TIME(1),
    /**
     * 距离
     */
    DISTANCE(2);

    @Getter
    private int code;

    PostOrderEnum(int code) {
        this.code = code;
    }
}
