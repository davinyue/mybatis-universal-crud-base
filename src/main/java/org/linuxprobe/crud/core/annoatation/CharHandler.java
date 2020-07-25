package org.linuxprobe.crud.core.annoatation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * char save type handle
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface CharHandler {
    CharCustomerType value() default CharCustomerType.ToInt;

    enum CharCustomerType {
        /**
         * save as int
         */
        ToInt,
        /**
         * save as sring
         */
        ToString,
    }
}
