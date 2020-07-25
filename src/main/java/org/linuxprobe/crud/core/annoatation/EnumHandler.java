package org.linuxprobe.crud.core.annoatation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * enum save type handle
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface EnumHandler {
    EnumCustomerType value() default EnumCustomerType.Ordinal;

    enum EnumCustomerType {
        /**
         * save as int ordinal
         */
        Ordinal,
        /**
         * save as name string
         */
        Name;
    }
}
