package com.qjz.enums.others;

import com.fanglin.common.core.enums.CodeEnum;
import lombok.Getter;

/**
 * 轮播图类型
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/5/16 20:27
 **/
public enum BannerTypeEnum implements CodeEnum {

    /**
     * 展示类型不可点击
     */
    SHOW(0),
    /**
     * 内链
     */
    IN_CHAIN(1),

    /**
     * 外链
     */
    OUTSIDE_CHAIN(2);

    @Getter
    private int code;

    BannerTypeEnum(int code) {
        this.code = code;
    }
}
