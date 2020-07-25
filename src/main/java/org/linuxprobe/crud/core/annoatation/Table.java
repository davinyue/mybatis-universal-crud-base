package org.linuxprobe.crud.core.annoatation;

import java.lang.annotation.*;

/**
 * 表名标注
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table {
    /**
     * 表名
     */
    String value();
}
