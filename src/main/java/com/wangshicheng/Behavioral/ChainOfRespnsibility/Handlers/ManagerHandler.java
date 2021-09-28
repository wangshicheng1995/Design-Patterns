package com.wangshicheng.Behavioral.ChainOfRespnsibility.Handlers;

import com.wangshicheng.Behavioral.ChainOfRespnsibility.Handler;
import com.wangshicheng.Behavioral.ChainOfRespnsibility.Request;

import java.math.BigDecimal;

/**
 * Manager：只能审核1000元以下的报销；
 */
public class ManagerHandler implements Handler {

    @Override
    public Boolean process(Request request) {
        //如果超过1000元，处理不了，交下一个处理
        if (request.getAmount().compareTo(BigDecimal.valueOf(1000)) > 0) {
            return null;
        }
        return !request.getName().equals("Bob");
    }
}
