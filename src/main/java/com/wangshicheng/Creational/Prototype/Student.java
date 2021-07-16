package com.wangshicheng.Creational.Prototype;

/**
 * Cloneable 标记接口
 * 标记实现这个接口的类能够被克隆
 */
public class Student implements Cloneable{
    private int id;
    private String name;
    private int score;

    /**
     * //复制新对象并返回
     * @return Object
     */
    @Override
    public Object clone() {
        Student std = new Student();
        std.id = this.id;
        std.name = this.name;
        std.score = this.score;
        return std;
    }

    /**
     * 原型模式更好的方法是定义一个 copy 方法，返回明确的类型
     * @return Student
     */
    public Student copy() {
        Student std = new Student();
        std.id = this.id;
        std.name = this.name;
        std.score = this.score;
        return std;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
