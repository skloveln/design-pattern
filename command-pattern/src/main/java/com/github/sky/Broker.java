package com.github.sky;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：经纪人
 *
 * @author sukai
 * @date 2021/10/20
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    /**
     * 接受命令
     *
     * @param order
     */
    public void takeOrder(Order order){
        orderList.add(order);
    }

    /**
     * 执行命令
     */
    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
