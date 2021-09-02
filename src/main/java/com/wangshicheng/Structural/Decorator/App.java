package com.wangshicheng.Structural.Decorator;

import com.wangshicheng.Structural.Decorator.decorator.BoldDecorator;
import com.wangshicheng.Structural.Decorator.decorator.ItalicDecorator;
import com.wangshicheng.Structural.Decorator.decorator.UnderlineDecorator;

public class App {
    public static void main(String[] args) {
        TextNode n1 = new SpanNode();
        TextNode n2 = new BoldDecorator(new ItalicDecorator(new UnderlineDecorator(new SpanNode())));
        n1.setText("Hello");
        n2.setText("Echo");
        System.out.println(n1.getText());
        System.out.println(n2.getText());
    }
}
