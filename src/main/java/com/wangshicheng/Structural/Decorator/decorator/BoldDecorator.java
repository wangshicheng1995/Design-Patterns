package com.wangshicheng.Structural.Decorator.decorator;

import com.wangshicheng.Structural.Decorator.TextNode;

/**
 * 装饰器的应用 - 加粗功能
 */
public class BoldDecorator extends NodeDecorator{

    public BoldDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<b>" + target.getText() + "</b>";
    }
}
