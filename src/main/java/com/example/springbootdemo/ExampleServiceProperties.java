package com.example.springbootdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/4/22
 * Time:23:53
 */
@ConfigurationProperties("example.service")
public class ExampleServiceProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
