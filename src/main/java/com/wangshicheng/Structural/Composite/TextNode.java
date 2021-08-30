package com.wangshicheng.Structural.Composite;

import java.util.List;

/**
 * 没有子节点的普通节点
 */
public class TextNode implements Node {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    @Override
    public Node add(Node node) {
        return null;
    }

    @Override
    public List<Node> children() {
        return null;
    }

    @Override
    public String toXml() {
        return text;
    }
}
