package com.wangshicheng.Behavioral.Command;

/**
 * 接受者，负责接收命令和执行命令
 */
public class Receiver {

    public void login() {
        System.out.println("登录");
    }

    public void logout() {
        System.out.println("登出");
    }

    public void doSomething(String str) {
        System.out.println(str);
    }
}
