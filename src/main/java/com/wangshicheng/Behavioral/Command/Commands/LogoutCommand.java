package com.wangshicheng.Behavioral.Command.Commands;

import com.wangshicheng.Behavioral.Command.Command;
import com.wangshicheng.Behavioral.Command.Receiver;

public class LogoutCommand implements Command {

    //拥有执行者对象
    private Receiver receiver;

    public LogoutCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.logout();
    }
}
