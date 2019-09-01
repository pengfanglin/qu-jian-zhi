package com.qjz.enums.post;

import com.fanglin.common.core.enums.CodeEnum;
import lombok.Getter;

/**
 * 结算方式
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/30 23:58
 **/
public enum ClearingFormEnum implements CodeEnum {

    /**
     * 无
     */
    NONE(0, ""),
    /**
     * 日结
     */
    DAY(1, "日结"),
    /**
     * 周结
     */
    WEEK(2, "周结"),
    /**
     * 月结
     */
    MONTH(3, "月结"),
    /**
     * 年结
     */
    YEAR(4, "年结");

    @Getter
    private int code;
    @Getter
    private String name;

    ClearingFormEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
