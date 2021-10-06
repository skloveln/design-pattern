package com.github.sky;

/**
 * 描述：素食汉堡实现
 *
 * @author sukai
 * @date 2021/10/6
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public float price() {
        return 14.9f;
    }
}
