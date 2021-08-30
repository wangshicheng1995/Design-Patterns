package com.wangshicheng.Structural.Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * 作为容器可以包含多个子节点
 */
public class ElementNode implements Node {

    private String name;
    private List<Node> list = new ArrayList<>();

    public ElementNode(String name) {
        this.name = name;
    }

    @Override
    public Node add(Node node) {
        list.add(node);
        return this;
    }

    @Override
    public List<Node> children() {
        return list;
    }

    @Override
    public String toXml() {
        String start = "<" + name + ">\n";
        String end = "</" + name + ">\n";
        StringJoiner sj = new StringJoiner("", start, end);
        list.forEach(node -> {
            sj.add(node.toXml() + "\n");
        });
        return String.valueOf(sj);
    }
}
