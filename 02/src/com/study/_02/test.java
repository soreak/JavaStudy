package com.study._02;

public class test {
    static {
        System.out.println("static");
    }
    public static void main(String[] args) {
        System.out.println("asd");
    }
}
interface a{
    default void run(){
        System.out.println("nihao");
    }
}