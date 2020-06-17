package com.study;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileBufferedTest {
    public static void main(String[] args) {
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader("10\\src\\nihao.txt"));
                BufferedWriter  bufferedWriter = new BufferedWriter(new FileWriter("10\\src\\1.txt"));
        ) {
            String line ;
            List<String> data = new ArrayList<>();
            while ((line = bufferedReader.readLine())!= null){
                data.add(line);
            }

            List<Character> size = new ArrayList<>();
            Collections.addAll(size,'零','一','二','三','四','五','六','七','八','九','十');
            Collections.sort(data,(s1,s2) -> size.indexOf(s1.charAt(0)) - size.indexOf(s2.charAt(0)));
            System.out.println(data);
            for (String datum : data) {
                bufferedWriter.write(datum);
                bufferedWriter.newLine();
            }
        }
        catch (Exception e ){
            e.printStackTrace();
        }
    }
}
