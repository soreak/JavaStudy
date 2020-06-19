package com.study;

public class JUnitDemo {
    public String test(String name,String Sno){
        if("soreak".equals(name)&&"123456".equals(Sno)){
            return "成功Login";
        }
        return "Login失败";
    }
}
