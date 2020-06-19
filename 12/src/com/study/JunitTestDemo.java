package com.study;


import org.junit.Assert;
import org.junit.Test;

public class JunitTestDemo {
    @Test
    public void test(){
        JUnitDemo jUnitDemo = new JUnitDemo();
        String result = jUnitDemo.test("soreak","123456");
        Assert.assertEquals("error","成功Login",result);

    }
}
