package com.study;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPTest_Client {
    public static void main(String[] args) throws Exception{
        System.out.println("启动++++++++++++");

        //创建一个数据包
        byte[] bytes = "NIHAOA".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,InetAddress.getLocalHost(),1234);

        //创建一个接受方
        DatagramSocket socket = new DatagramSocket();

        //开始发送数据包
        socket.send(packet);
    }
}
