package com.fanyafeng.singleton.demo;

/**
 * Created by fanyafeng on 16/6/30.
 *
 * 工具自建的单例模式
 * 饿汉式,多线程安全
 * 容易产生垃圾对象,类加载时就初始化,浪费内存
 * 没有加锁,执行效率会提高
 *
 */
public class OneSingleton {
    private static OneSingleton ourInstance = new OneSingleton();

    public static OneSingleton getInstance() {
        return ourInstance;
    }

    private OneSingleton() {
    }

    public void showMessage() {
        System.out.println("打印单例信息");
    }
}
