package com.wangshicheng.Structural.Composite;

import java.util.List;

/**
 * 注释节点
 */
public class CommentNode implements Node{

    private String text;

    public CommentNode(String text) {
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
        return "<!-- " + text + " -->";
    }
}
