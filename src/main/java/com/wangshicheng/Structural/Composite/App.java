package com.wangshicheng.Structural.Composite;

/**
 * 通过组合设计模式构造一颗树
 */
public class App {
    public static void main(String[] args) {
        Node root = new ElementNode("book");
        root.add(new ElementNode("三毛")
                .add(new TextNode("万里千山走遍"))
                .add(new TextNode("梦里花落知多少")));
        root.add(new ElementNode("加西亚·马尔克斯")
                .add(new TextNode("一个没有人给他写信的上校"))
                .add(new TextNode("霍乱时期的爱情"))
                .add(new CommentNode("很久没有读马尔克斯的书了")));
        System.out.println(root.toXml());
    }
}
