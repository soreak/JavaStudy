package com.study.ThreadTalk;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class RightNowTalk_Client {
    public static void main(String[] args) throws Exception {
        System.out.println("+++++++++客户端启动+++++++++++");

        //请求一个Socket
        Socket socket = new Socket("192.168.56.1", 1235);

        //获取一个字节输出流
        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);

        //开始发信息
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("发送：");
            ps.println(sc.nextLine());
            ps.flush();

            System.out.println("客户端发送完毕");
        }
    }
}
