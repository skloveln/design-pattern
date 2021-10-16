package com.github.sky;

/**
 * 描述：上下文环境
 *
 * @author sukai
 * @date 2021/10/16
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
