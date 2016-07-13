package com.fanyafeng.singleton;

import com.fanyafeng.singleton.demo.OneSingleton;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by fanyafeng on 16/6/30.
 * <p>
 * 只列举了线程安全的单例模式
 */
public class main {
    public static void main(String[] args) {
//        OneSingleton oneSingleton=OneSingleton.getInstance();
//        oneSingleton.showMessage();

        String[] s1 = new String[]{"s1", "s2", "s3"};
        String[] s2 = new String[]{"s3", "s5", "s4"};
        Integer[] i1 = new Integer[]{1, 2, 3};
        Integer[] i2 = new Integer[]{5, 4, 3};
        String[] smx = mix(s1, s2);
        Integer[] is = mix(i1, i2);
        for (String str : smx) {
            System.out.println(str);
        }
        for (Integer i : is) {
            System.out.println(i);
        }
    }

    /**
     * 合并+去重
     *
     * @param ts1
     * @param ts2
     * @return
     */
    public static <T> T[] mix(T[] ts1, T[] ts2) {
        // 可改动区域开始
        Set<T> tSet = new TreeSet<>();
        for (T t : ts1) {
            tSet.add(t);
        }
        for (T t : ts2) {
            tSet.add(t);
        }
        List<T> tList = new ArrayList<>(tSet);
        int setLength = tSet.size();
        T[] both = (T[]) Array.newInstance(ts1.getClass().getComponentType(), setLength);

        for (int i = 0; i < setLength; i++) {
            both[i] = tList.get(i);
        }

        return both;
        // 可改动区域结束
    }
//    T[] both = (T[]) Array.newInstance(ts1.getClass().getComponentType(), ts1.length + ts2.length);
//        Object[] bothObj = Stream.concat(Arrays.stream(ts1), Arrays.stream(ts2)).toArray();
//        for (int i = 0; i < both.length; i++) {
//            both[i] = (T) bothObj[i];
//        }
}
