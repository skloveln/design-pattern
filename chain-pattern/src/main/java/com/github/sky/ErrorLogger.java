package com.github.sky;

/**
 * 描述：错误记录
 *
 * @author sukai
 * @date 2021/10/19
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
