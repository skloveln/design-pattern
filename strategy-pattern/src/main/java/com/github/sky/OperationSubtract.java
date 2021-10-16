package com.github.sky;

/**
 * 描述：减法策略
 *
 * @author sukai
 * @date 2021/10/16
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
