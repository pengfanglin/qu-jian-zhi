package com.qjz.enums.post;

import com.fanglin.common.core.enums.CodeEnum;
import lombok.Getter;

/**
 * 薪资单位
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/30 23:58
 **/
public enum PriceUnitEnum implements CodeEnum {

    /**
     * 无
     */
    NONE(0,""),
    /**
     * 时
     */
    HOUR(1,"时"),
    /**
     * 天
     */
    DAY(2,"天"),
    /**
     * 周
     */
    WEEK(3,"周"),
    /**
     * 月
     */
    MONTH(4,"月"),
    /**
     * 年
     */
    YEAR(5,"年");

    @Getter
    private int code;
    @Getter
    private String name;

    PriceUnitEnum(int code,String name) {
        this.code = code;
        this.name=name;
    }
}
