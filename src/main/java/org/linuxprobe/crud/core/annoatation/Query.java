package org.linuxprobe.crud.core.annoatation;

import java.lang.annotation.*;

/**
 * 用于查询对象标注该查询对象查询的是哪个实体
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Query {
    Class<?> value();
}


