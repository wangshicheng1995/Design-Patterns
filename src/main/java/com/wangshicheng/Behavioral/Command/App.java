package com.wangshicheng.Behavioral.Command;

import com.wangshicheng.Behavioral.Command.Commands.LoginCommand;
import com.wangshicheng.Behavioral.Command.Commands.LogoutCommand;

/**
 * Command 设计模式 - 客户端
 */
public class App {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        receiver.doSomething("传入一个命令");

        //执行一个登录
        Command login = new LoginCommand(receiver);
        login.execute();

        //执行一个登出
        Command logout = new LogoutCommand(receiver);
        logout.execute();
    }
}
