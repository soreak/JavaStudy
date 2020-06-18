package com.study.ThreadTalk;

import java.net.ServerSocket;
import java.net.Socket;

public class RightNowTalk_Server {
    public static void main(String[] args) {
        System.out.println("+++++++服务端启动+++++++");

        try {
            //注册端口
            ServerSocket ss = new ServerSocket(1235);

            //创建线程池对象
            HandleSocketTheadPool handleSocketTheadPool =
                    new HandleSocketTheadPool(3, 100);

            //循环多线程处理多客户端
            while (true) {
                //创建一个Socket,开始等待客户端
                Socket socket = ss.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了");

                handleSocketTheadPool.execute(new ReaderClientRunnable(socket));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
