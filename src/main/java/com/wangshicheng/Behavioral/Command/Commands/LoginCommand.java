package com.wangshicheng.Behavioral.Command.Commands;

import com.wangshicheng.Behavioral.Command.Command;
import com.wangshicheng.Behavioral.Command.Receiver;

/**
 * Command类的实现类，对抽象类中声明的方法进行实现
 */
public class LoginCommand implements Command {

    //拥有执行者对象
    private Receiver receiver;

    public LoginCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.login();
    }
}
