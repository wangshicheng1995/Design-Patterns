package com.wangshicheng.Structural.Decorator.decorator;

import com.wangshicheng.Structural.Decorator.TextNode;

/**
 * 字体加下划线功能
 */
public class UnderlineDecorator extends NodeDecorator{

    public UnderlineDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<u>" + target.getText() + "</u>";
    }
}
