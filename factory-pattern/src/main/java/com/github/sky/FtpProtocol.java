package com.github.sky;

/**
 * FTP协议实现
 */
public class FtpProtocol implements Protocol{

    @Override
    public void connect() {
        System.out.println("使用ftp协议进行连接......");
    }
}
