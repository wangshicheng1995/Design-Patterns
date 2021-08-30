package com.wangshicheng.Structural.Composite;

import java.util.List;

/**
 * composite 组合模式抽象节点类型
 */
public interface Node {
    //添加一个节点为子节点
    Node add(Node node);
    //获取子节点
    List<Node> children();
    //输出为 XML
    String toXml();
}
