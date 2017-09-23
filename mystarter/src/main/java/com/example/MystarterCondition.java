package com.example;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by pkpk1234 on 2017/6/12.
 */
public class MystarterCondition implements Condition {

    //当环境变量mystarter不为空时，条件成立
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String mystarter = context.getEnvironment().getProperty("mystarter");
        if (StringUtils.isNotBlank(mystarter)) {
            return true;
        }
        return false;
    }
}
