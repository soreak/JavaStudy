package com.study._04;

public class ZhengZe {
    public static void main(String[] args) {
        String a = "123456789";
        for (int i = 0; i < a.length(); i++) {
            char a1 = a.charAt(i);
            System.out.println(a1);
            if (a1<'0'||a1>'9'){
                System.out.println("error");
            }
            
        }
    }
}
