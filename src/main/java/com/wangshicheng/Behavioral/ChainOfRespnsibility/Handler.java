package com.wangshicheng.Behavioral.ChainOfRespnsibility;

/**
 * 处理请求的处理器
 */
public interface Handler {

    /**
     * 返回 true = 成功
     * 返回 false = 拒绝
     * 返回 null = 交个下一个处理
     */
    Boolean process(Request request);
}
