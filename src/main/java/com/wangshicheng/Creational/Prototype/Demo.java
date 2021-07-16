package com.wangshicheng.Creational.Prototype;

import java.util.Arrays;

/**
 * 原型设计模式
 * - 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 */
public class Demo {
    public static void main(String[] args) {
        //将此过程封装 origin -> new object
        String[] original = {"Apple", "Pear", "Banana"};
        String[] copy = Arrays.copyOf(original, original.length);
        Arrays.asList(copy).forEach(System.out::println);

        Student std = new Student();
        std.setId(123);
        std.setName("echo");
        std.setScore(88);
        //复制新的对象
        Student std1 = (Student) std.clone();
        System.out.println(std);
        System.out.println(std1);
        //false
        System.out.println(std.equals(std1));
        //false
        System.out.println(std == std1);
    }
}
