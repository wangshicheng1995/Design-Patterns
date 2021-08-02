package com.wangshicheng.Creational.Singleton;

public class Singleton {

    /**
     * 静态字段引用唯一实例
     * - 因为使用了 private 修饰 singleton 的构造，这个类的构造只能够被这个类的内部所使用，因此在内部实例化对象
     * - 使用 static 修饰 instance 的作用是让 instance 摆脱 singleton 实例化对象的限制(普通类属性
     *   只能在类实例化后才能使用，换句话说，如果不用 static 修饰，则外部类无法使用还没有实例化的 singleton)
     * - static 修饰了 instance 后，无论外部有多少个调用 singleton，都永远会返回同一个 singleton 的实例
     *   因为 static 修饰的属性存放在全局数据区
     */
    private static final Singleton INSTANCE = new Singleton();

    //提供静态方法返回实例
    public static Singleton getInstance() {
        return INSTANCE;
    }

    //private 构造方法保证外部无法实例化
    private Singleton() {}
}
