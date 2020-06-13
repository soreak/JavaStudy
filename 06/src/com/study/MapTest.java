package com.study;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        List<Integer> list = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String data = sc.next();
        Map<Character,Integer> dataMemory = new HashMap<>();
        for (int i = 0;i<data.length();i++){
            char a = data.charAt(i);
            if (dataMemory.containsKey(a)){
                dataMemory.put(a,dataMemory.get(a)+1);
            }else{
                dataMemory.put(a,1);
            }
        }
        System.out.println(dataMemory);


    }

}
class a implements Comparable{

    @Override
    public int compareTo(Object o) {
            return 0;
    }
}
