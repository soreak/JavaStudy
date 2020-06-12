package com.study._04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        String date = "11-04-2020 11:09:09";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        Date newDate = sdf.parse(date);

        System.out.println(newDate);
    }
}
