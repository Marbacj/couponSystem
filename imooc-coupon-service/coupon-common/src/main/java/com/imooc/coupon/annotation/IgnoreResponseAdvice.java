package com.imooc.coupon.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h1>忽略统一响应注解定义</h1>
 * Created by Marbach
 * 特殊情况
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
//运行时起作用
public @interface IgnoreResponseAdvice {
}
