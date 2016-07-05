package com.fanyafeng.singleton.demo;

/**
 * Created by fanyafeng on 16/7/5.
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}
    public static synchronized Singleton2 getInstance(){
        if (instance==null){
            instance=new Singleton2();
        }
        return instance;
    }
}
