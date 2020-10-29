package com.felix.springmvcdemo.annotation;

/**
 * @author felix
 * @date 2020-10-15 10:24
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation   {
    String getValue() default "annottation value";
}
