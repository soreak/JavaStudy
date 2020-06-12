package com.study._03;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.Objects;

public class test3 {
    public static void main(String[] args) {
        Object a1 = new a();
        a a = (a) a1;
        a.setName("1");
        a.setAge(1);
        a.setSex('s');
        System.out.println(a.getClass());
        Object a2 = new a();
        a b = (a) a2;
        b.setName("1");
        b.setAge(2);
        b.setSex('3');
        System.out.println(b.getClass());
        System.out.println(a.equals(b));


    }
}
class a{
    public String name;
    public int age;
    public char sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        a a = (a) o;
        return
                Objects.equals(name, a.name);
    }

    @Override
    public String toString() {
        return "a{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}