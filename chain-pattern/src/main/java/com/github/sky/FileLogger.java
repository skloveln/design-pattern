package com.github.sky;

/**
 * 描述：文件记录
 *
 * @author sukai
 * @date 2021/10/19
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}