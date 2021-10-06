package com.github.sky;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：套餐
 *
 * @author sukai
 * @date 2021/10/6
 */
@NoArgsConstructor
@AllArgsConstructor
public class Meal {

    /**
     * 套餐条目
     */
    private List<Item> items = new ArrayList<>();
    /**
     * 套餐名称
     */
    @Getter
    private String name;


    /**
     * 获取套餐总价
     *
     * @return
     */
    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 展示套餐内容
     */
    public void showItems() {
        for (Item item : items) {
            System.out.print("  类目 : " + item.name());
            System.out.print(", 打包方式 : " + item.packing().pack());
            System.out.println(", 价格 : " + item.price());
        }
    }

}
