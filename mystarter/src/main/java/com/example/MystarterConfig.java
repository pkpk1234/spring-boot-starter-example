package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by pkpk1234 on 2017/6/12.
 */
@ConfigurationProperties(prefix = "mystarter")
public class MystarterConfig {

    private String version;
    private String name;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
