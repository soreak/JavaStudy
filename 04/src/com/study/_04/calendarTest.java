package com.study._04;

import java.util.Calendar;
import java.util.Date;

public class calendarTest {
    public static void main(String[] args) {


        Calendar rightNow = Calendar.getInstance();

        Date year = rightNow.getTime();
        System.out.println(year);
        Double a =123.6;
        int a1 = a.intValue();
        System.out.println(a1);
    }
}
