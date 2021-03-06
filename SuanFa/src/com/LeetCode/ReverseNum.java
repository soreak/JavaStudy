package com.LeetCode;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(new Solution2().reverse(-123456));
    }
}

class Solution2 {
    public int reverse(int x) {
        try{
            int a = Integer.valueOf(new StringBuilder().append(Math.abs(x)).reverse().toString());
            return x < 0 ? -a:a;
        }catch (NumberFormatException e ){
            return 0;
        }
    }
}
