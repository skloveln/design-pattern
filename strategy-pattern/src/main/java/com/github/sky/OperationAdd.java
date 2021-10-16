package com.github.sky;

/**
 * 描述：加法策略
 *
 * @author sukai
 * @date 2021/10/16
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
