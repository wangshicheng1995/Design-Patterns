package com.wangshicheng.Structural.Decorator;

/**
 * span 节点
 */
public class SpanNode implements TextNode{

    private String text;

    public SpanNode() {
        super();
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "<span>" + text + "<span>";
    }
}
