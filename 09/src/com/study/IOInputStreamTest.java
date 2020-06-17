package com.study;

public class IOInputStreamTest {

    public static void main(String[] args) {
        int a = -123456;
        String a1 = String.valueOf(a);
        StringBuilder b = new StringBuilder(a1);
        String c = b.reverse().toString();
        String d = c.substring(0,c.length()-1);

        System.out.println(d);
    }

}
