package com.github.sky;

/**
 * 描述：鸡肉汉堡实现
 *
 * @author sukai
 * @date 2021/10/6
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 20.0f;
    }

}
