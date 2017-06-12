package com.example.impl;

import com.example.MystartService;
import com.example.MystarterConfig;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by pkpk1234 on 2017/6/12.
 */
public class SysoutMystartService implements MystartService {

    private final MystarterConfig mystarterConfig;

    @Autowired
    public SysoutMystartService(MystarterConfig mystarterConfig) {
        this.mystarterConfig = mystarterConfig;
    }

    public String sayHello() {
        String x = "my starter: version is "
                + mystarterConfig.getVersion()
                + ",name is "
                + mystarterConfig.getName();
        System.out.println(x);
        return x;
    }
}
