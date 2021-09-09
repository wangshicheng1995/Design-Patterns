package com.wangshicheng.Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元设计模式
 * 主要应用于缓存，即客户端如果重复请求某些对象，不必每次查询数据库或者读取文件，而是直接返回内存中缓存的数据。
 */
public class Student {

    //持有缓存
    private static final Map<String, Student> cache = new HashMap<>();

    public static Student create(int id, String name) {
        String key = id + "\n" + name;
        Student std = cache.get(key);

        if (std == null) {
            //未找到，创建新对象
            System.out.println(String.format("create new Student(%s, %s)", id, name));
            std = new Student(id, name);
            //放入缓存
            cache.put(key, std);
        } else {
            //缓存中存在
            System.out.println(String.format("return cached Student(%s, %s)", std.id, std.name));
        }
        return std;
    }

    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
