package com.github.sky;

import lombok.AllArgsConstructor;

/**
 * 描述：卖股票命令
 *
 * @author sukai
 * @date 2021/10/20
 */
@AllArgsConstructor()
public class SellStock implements Order {

    private Stock stock;

    @Override
    public void execute() {
        stock.sell();
    }
}
