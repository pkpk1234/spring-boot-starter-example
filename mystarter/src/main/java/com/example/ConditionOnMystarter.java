package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by pkpk1234 on 2017/6/12.
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@ConditionalOnClass(MystarterCondition.class) // 使用条件判断类MystarterCondition
@ConditionalOnMissingBean(MystartService.class) // 不能已经存在类型为MystartService的Bean
// 属性mystart.enable必须为true
@ConditionalOnProperty(prefix = "mystarter", name = "enable", havingValue = "true")
public @interface ConditionOnMystarter {
}
