package com.wangshicheng.Behavioral.ChainOfRespnsibility;

import com.wangshicheng.Behavioral.ChainOfRespnsibility.Handler;
import com.wangshicheng.Behavioral.ChainOfRespnsibility.Request;

import java.util.ArrayList;
import java.util.List;

/**
 * 把不同的 handler 组合起来，变成一个链，提供一个统一的入口
 */
public class HandlerChain {
    //持有所有 handler
    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        this.handlers.add(handler);
    }

    public boolean process(Request request) {
        //依次调用每个 handler
        for (Handler handler : handlers) {
            Boolean r = handler.process(request);
            if (r != null) {
                //返回 true 或者 false 处理结束；返回 null 交给下一个处理
                System.out.println(request + (r ? "Approve by " : "Denied by ") + handler.getClass().getSimpleName());
                return r;
            }
        }
        throw new RuntimeException("Could not handle request: " + request);
    }
}
