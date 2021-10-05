package com.github.sky;

/**
 * TCP协议实现
 *
 * @author sukai
 */
public class TcpProtocol implements Protocol {

    @Override
    public void connect() {
        System.out.println("使用tcp协议进行连接......");
    }
}
