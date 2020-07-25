package org.linuxprobe.crud.core.annoatation;

import java.lang.annotation.*;

/**
 * 忽略该字段，用于对象有这个字段，但数据库没有该列的情况
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Transient {

}
