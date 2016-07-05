package com.fanyafeng.singleton;

import com.fanyafeng.singleton.demo.OneSingleton;

/**
 * Created by fanyafeng on 16/6/30.
 *
 * 只列举了线程安全的单例模式
 */
public class main {
    public static void main(String[] args) {
        OneSingleton oneSingleton=OneSingleton.getInstance();
        oneSingleton.showMessage();


    }
}
