package com.study;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPTest_Server {
    public static void main(String[] args) throws Exception {
        System.out.println("接收++++++++++++");

        //创建一个接受客户端的数据包对象
        byte[] bytes = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

        //创建一个接收端的对象
        DatagramSocket socket = new DatagramSocket(1234);

        //接受数据
        socket.receive(packet);

        //分析获取的数据量
        int len =packet.getLength();

        //输出
        String string = new String(bytes,0,len);
        System.out.println(string);

        //获取客户端的IP与端口
        String ip = packet.getAddress().getHostAddress();
        int port = packet.getPort();
        System.out.println(ip+":"+port);

        socket.close();

    }
}
