package com.study._03;

public class test1 {
    public static void main(String[] args) {
        Outter.Inner a = new Outter().new Inner();

    }
}
class Outter{

    public class Inner{
        public static final String name = "123";
    }

}