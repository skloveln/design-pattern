package com.github.sky;


import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：套餐构建器
 *
 * @author sukai
 * @date 2021/10/6
 */
public class MealBuilder {

    /**
     * 套餐名称
     */
    private String name;
    /**
     * 套餐条目
     */
    private List<Item> items = new ArrayList<>();

    /**
     * 构建套餐A
     *
     * @return
     */
    public Meal mealABuild() {
        this.items.clear();
        this.addItem(new VegBurger()).addItem(new Coke()).setName("套餐A");
        return this.build();
    }

    /**
     * 构建套餐B
     *
     * @return
     */
    public Meal mealBuild() {
        this.items.clear();
        this.addItem(new ChickenBurger()).addItem(new Pepsi()).setName("套餐B");
        return this.build();
    }

    /**
     * 增加套餐条目
     *
     * @param item
     * @return
     */
    public MealBuilder addItem(Item item) {
        this.items.add(item);
        return this;
    }

    /**
     * 设置套餐名称
     *
     * @param name
     * @return
     */
    public MealBuilder setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 构建套餐
     *
     * @return
     */
    public Meal build() {
        if (items.size() == 0) {
            throw new RuntimeException("未设置套餐明细");
        }
        if (StringUtils.isEmpty(name)) {
            throw new RuntimeException("未设置套餐名称");
        }
        return new Meal(items, name);
    }

}
