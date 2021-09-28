package com.wangshicheng.Behavioral.ChainOfRespnsibility.Handlers;

import com.wangshicheng.Behavioral.ChainOfRespnsibility.Handler;
import com.wangshicheng.Behavioral.ChainOfRespnsibility.Request;

/**
 * CEO：可以审核任意额度。
 */
public class CEOHandler implements Handler {

    @Override
    public Boolean process(Request request) {
        return true;
    }
}
