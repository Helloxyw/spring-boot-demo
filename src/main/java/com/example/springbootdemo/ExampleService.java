package com.example.springbootdemo;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/4/22
 * Time:23:42
 */
public class ExampleService {

    private String prefix;
    private String suffix;

    public ExampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    /**
     * 字符串添加前后缀
     * @param word
     * @return
     */
    public String wrap(String word){
        System.out.println("hello starter");
        return prefix + word + suffix;
    }
}
