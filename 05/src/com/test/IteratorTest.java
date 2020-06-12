package com.test;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.forEach(s -> {
            System.out.println(s);
        });
        a.forEach(System.out::println);
    }
}
