package com.fanyafeng.singleton.demo;

/**
 * Created by fanyafeng on 16/7/5.
 */
public class Singleton4 {
    private static class SingletonHolder{
        private static final Singleton4 INSTANCE=new Singleton4();
    }

    private Singleton4(){}

    public static final Singleton4 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
