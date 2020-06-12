package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shuzu {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        Collections.addAll(cards,new Card("1",12),new Card("2",13),new Card("3",14));
        for (int i=0;i<cards.size();i++){
            System.out.println(cards.get(i).toString());
        }


    }


}
