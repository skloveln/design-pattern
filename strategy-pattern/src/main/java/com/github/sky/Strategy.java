package com.github.sky;

/**
 * 描述：策略接口
 *
 * @author sukai
 * @date 2021/10/16
 */
public interface Strategy {

    /**
     * 对两个数字进行算法运算
     *
     * @param num1 数字1
     * @param num2 数字2
     * @return
     */
    public int doOperation(int num1, int num2);
}
