package com.github.sky;

/**
 * 描述：控制台记录
 *
 * @author sukai
 * @date 2021/10/19
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
