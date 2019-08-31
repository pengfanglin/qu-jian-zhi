package com.qjz.enums.others;

import com.fanglin.common.core.enums.CodeEnum;
import lombok.Getter;

/**
 * 学历
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/28 14:06
 **/
public enum EducationEnum implements CodeEnum {
    /**
     * 无学历
     */
    NONE(0),
    /**
     * 小学
     */
    SMALL(1),
    /**
     * 初中
     */
    JUNIOR(2),
    /**
     * 中专
     */
    TECHNICAL_SECONDARY(3),
    /**
     * 高中
     */
    HIGH(4),
    /**
     * 大专
     */
    COLLEGE(5),
    /**
     * 本科
     */
    UNDERGRADUATE(6),
    /**
     * 硕士
     */
    master(7),
    /**
     * 博士
     */
    doctor(8),
    /**
     * 博士后
     */
    postdoctoral(9);

    @Getter
    private int code;

    EducationEnum(int code) {
        this.code = code;
    }
}
