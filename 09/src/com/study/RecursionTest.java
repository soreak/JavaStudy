package com.study;

public class RecursionTest {

    public static void main(String[] args) {
        //System.out.println(sum(10));
        int pingzi = 10 / 2;
        int gaizi = pingzi;
        int kongping = pingzi;

        System.out.println(pingzi+count(gaizi, kongping));

    }

    //第一天 x
    //第二天 x/2-1
    //第三天 (x/2-1)/2-1
    //...
    //第十天 1
    public static int sum(int a) {
        if (a == 1) {
            return 1;
        } else {
            return (sum(a - 1) + 1) * 2;
        }
    }
//    非规律化递归：啤酒问题：（作业）
//    啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶
//         ，问10元可以喝多少瓶，剩余多少盖子和瓶子！！  15 3 1

    public static int count(int gaizi, int kongping) {
        if (gaizi >= 4 || kongping >= 2) {
            int nowgz = gaizi / 4 + gaizi % 4 + kongping / 2;
            int nowkp = kongping / 2 + kongping % 2 + gaizi / 4;
            return (gaizi / 4) + (kongping / 2) + count(nowgz, nowkp);
        }
        System.out.println(gaizi+"   "+kongping);
        return 0;
    }

}
