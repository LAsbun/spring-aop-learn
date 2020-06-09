package com.example.springaoplearn.aop;

import java.lang.annotation.*;

/**
 * 鉴权注解
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface AuthAspect {
}
