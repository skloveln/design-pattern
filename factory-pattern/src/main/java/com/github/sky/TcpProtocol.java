package com.github.sky;

/**
 * TCP协议实现
 */
public class TcpProtocol implements Protocol{

    @Override
    public void connect() {
        System.out.println("使用tcp协议进行连接......");
    }
}
