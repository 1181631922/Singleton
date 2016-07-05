package com.fanyafeng.singleton.demo;

/**
 * Created by fanyafeng on 16/7/5.
 *
 * 懒加载,线程安全
 * 采用双锁机制,安全并且在多线程情况下能保持高性能
 *
 */
public class Singleton3 {
    private volatile static Singleton3 singleton3;

    private Singleton3() {
    }

    public static Singleton3 getSingleton3() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
