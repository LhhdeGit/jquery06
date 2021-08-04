package com.bean;

public class Table {
    private String name;
    private int age;
    private String bj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bj='" + bj + '\'' +
                '}';
    }
}
