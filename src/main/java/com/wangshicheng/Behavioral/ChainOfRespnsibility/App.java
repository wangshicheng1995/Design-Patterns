package com.wangshicheng.Behavioral.ChainOfRespnsibility;

import com.wangshicheng.Behavioral.ChainOfRespnsibility.Handlers.CEOHandler;
import com.wangshicheng.Behavioral.ChainOfRespnsibility.Handlers.DirectorHandler;
import com.wangshicheng.Behavioral.ChainOfRespnsibility.Handlers.ManagerHandler;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        //构造责任链
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new ManagerHandler());
        chain.addHandler(new DirectorHandler());
        chain.addHandler(new CEOHandler());

        //处理请求
        chain.process(new Request("Bob", new BigDecimal(123.45)));
        chain.process(new Request("Alice", new BigDecimal(1234.56)));
        chain.process(new Request("Pig", new BigDecimal(12345.67)));
        chain.process(new Request("Echo", new BigDecimal(123456.78)));
    }
}
