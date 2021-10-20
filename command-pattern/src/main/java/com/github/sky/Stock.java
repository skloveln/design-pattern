package com.github.sky;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 描述：股票
 *
 * @author sukai
 * @date 2021/10/20
 */
@Getter
@RequiredArgsConstructor()
public class Stock {

    /**
     * 股票名称
     */
    private final String name;
    /**
     * 股票数量
     */
    private final int quantity;

    /**
     * 卖股票
     */
    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }

    /**
     * 买股票
     */
    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }
}
