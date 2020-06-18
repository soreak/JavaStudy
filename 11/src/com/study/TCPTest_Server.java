package com.study;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest_Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动+++++++");

        //注册端口
        ServerSocket ss = new ServerSocket(1235);

        //循环多线程处理多客户端
        while (true) {
            //创建一个Socket,开始等待客户端
            Socket socket = ss.accept();

            //创建线程
            new ServerThread(socket).start();

        }
    }
}

class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                //从管道中得到一个字节输入流
                InputStream is = socket.getInputStream();
                Reader reader = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(reader);
        ) {
            //读取信息
            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress()+"---->:"+ msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress()+"下线了");
        }
    }
}