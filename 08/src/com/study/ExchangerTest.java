package com.study;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class ExchangerTest {
    public static void main(String[] args) {
        // 创建交换对象（信使）
        Exchanger<String> exchanger = new Exchanger<>();
        // 创建2给线程对象。
        new ThreadA(exchanger).start();
        new ThreadB(exchanger).start();
    }
}


class ThreadA extends Thread{
    private Exchanger<String> exchanger;
    public ThreadA(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }
    @Override
    public void run() {
        try {
            // 礼物A
            System.out.println("线程A,做好了礼物A,等待线程B送来的礼物B.....");
            // 开始交换礼物。参数是送给其他线程的礼物!
            // System.out.println("线程A收到线程B的礼物："+exchanger.exchange("礼物A"));
            // 如果等待了5s还没有交换它就去死（抛出异常）！
            String rs = exchanger.exchange("礼物A");
            String rs1 = exchanger.exchange("礼物A+");
            System.out.println("线程A收到线程B的礼物："+rs+rs1);
        } catch (Exception e) {
            System.out.println("线程A等待了5s，没有收到礼物,最终就执行结束了!");
        }
    }
}

class ThreadB extends Thread{
    private Exchanger<String> exchanger;
    public ThreadB(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }
    @Override
    public void run() {
        try {
            // 礼物B
             System.out.println("线程B,做好了礼物B,等待线程A送来的礼物A.....");
            // 开始交换礼物。参数是送给其他线程的礼物!
            String rs = exchanger.exchange("礼物B");
            String rs2 = exchanger.exchange("礼物B+");
             System.out.println("线程B收到线程A的礼物："+rs+rs2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}