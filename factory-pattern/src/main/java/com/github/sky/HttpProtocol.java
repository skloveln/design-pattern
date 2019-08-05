package com.github.sky;

/**
 * HTTP协议实现
 */
public class HttpProtocol implements Protocol{

    @Override
    public void connect() {
        System.out.println("使用http协议进行连接......");
    }
}
