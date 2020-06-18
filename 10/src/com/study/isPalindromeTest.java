package com.study;

public class isPalindromeTest {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(121));
    }
}
//回文数
class Solution {
    public boolean isPalindrome(int x) {
        String a = new StringBuilder().append(x).reverse().toString();

        if(String.valueOf(x).equals(a)){
            return true;
        }else{
            return false;
        }
    }
}