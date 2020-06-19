package com.LeetCode;

public class romanNum {
    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("III"));
        System.out.println(new Solution().romanToInt("IV"));
        System.out.println(new Solution().romanToInt("IX"));
        System.out.println(new Solution().romanToInt("LVIII"));
        System.out.println(new Solution().romanToInt( "MCMXCIV"));
    }
}

class Solution {
    public int romanToInt(String s) {
        int num = 0;
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s1.length;) {
            switch (s1[i]) {
                case 'I':
                    if (i+1<s1.length&&s1[i + 1] == 'V') {
                        num = num + 4;
                        i = i + 2;
                        break;

                    } else if (i+1<s1.length&&s1[i + 1] == 'X') {
                        num = num + 9;
                        i = i + 2;
                        break;

                    }else{
                        num = num +1;
                        i++;
                        break;

                    }
                case 'V': num = num +5;i++;break;


                case 'X':
                    if (i+1<s1.length&&s1[i + 1] == 'L') {
                        num = num + 40;
                        i = i + 2;break;
                    } else if (i+1<s1.length&&s1[i + 1] == 'C') {
                        num = num + 90;
                        i = i + 2;break;
                    }else{
                        num = num +10;
                        i++;break;
                    }
                case 'L':num = num+50;i++;break;
                case 'C':
                    if (i+1<s1.length&&s1[i + 1] == 'D') {
                        num = num + 400;
                        i = i + 2;break;
                    } else if (i+1<s1.length&&s1[i + 1] == 'M') {
                        num = num + 900;
                        i = i + 2;break;
                    }else{
                        num = num +100;
                        i++;break;
                    }
                case 'D':num = num+500;i++;break;
                case 'M':num = num+1000;i++;break;
            }
        }
        return num;
    }
}
