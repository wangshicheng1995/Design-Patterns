package com.wangshicheng.Behavioral.ChainOfRespnsibility.Handlers;

import com.wangshicheng.Behavioral.ChainOfRespnsibility.Handler;
import com.wangshicheng.Behavioral.ChainOfRespnsibility.Request;

import java.math.BigDecimal;

/**
 * Director：只能审核10000元以下的报销；
 */
public class DirectorHandler implements Handler {

    @Override
    public Boolean process(Request request) {
        //如果超过10000元，处理不了，交下一个处理
        if (request.getAmount().compareTo(BigDecimal.valueOf(10000)) > 0) {
            return null;
        }
        return true;
    }
}
