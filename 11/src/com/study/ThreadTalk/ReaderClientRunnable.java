package com.study.ThreadTalk;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;

public class ReaderClientRunnable implements Runnable{

    private Socket socket;

    public ReaderClientRunnable(Socket socket) {
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
                System.out.println(socket.getRemoteSocketAddress() + "---->:" + msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
        }
    }
}

