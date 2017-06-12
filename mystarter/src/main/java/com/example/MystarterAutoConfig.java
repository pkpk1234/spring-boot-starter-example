package com.example;

import com.example.impl.SysoutMystartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pkpk1234 on 2017/6/12.
 */
@Configuration
@ConditionOnMystarter
@EnableConfigurationProperties(MystarterConfig.class)
public class MystarterAutoConfig {
    @Autowired
    private MystarterConfig mystarterCondition;

    @Bean
    public MystartService mystartService() {
        return new SysoutMystartService(this.mystarterCondition);
    }
}
