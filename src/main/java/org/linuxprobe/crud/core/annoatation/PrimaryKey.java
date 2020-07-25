package org.linuxprobe.crud.core.annoatation;

import java.lang.annotation.*;

/**
 * 主键标注
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PrimaryKey {
    /**
     * 指定主键生成模式
     */
    Strategy value();

    /**
     * 主键生成模式
     */
    enum Strategy {
        /**
         * 由数据库生成
         */
        NATIVE,
        /**
         * 由uuid生成
         */
        UUID,
        /**
         * 自指定
         */
        ASSIGNED
    }
}
