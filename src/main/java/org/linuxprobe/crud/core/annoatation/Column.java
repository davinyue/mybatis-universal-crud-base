package org.linuxprobe.crud.core.annoatation;

import java.lang.annotation.*;

/**
 * 列名标注
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column {
    /**
     * 列名
     */
    String value() default "";
}
