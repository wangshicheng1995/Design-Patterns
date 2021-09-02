package com.wangshicheng.Structural.Decorator.decorator;

import com.wangshicheng.Structural.Decorator.TextNode;

/**
 * 字体变斜体功能
 */
public class ItalicDecorator extends NodeDecorator{

    public ItalicDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<i>" + target.getText() + "</i>";
    }
}
