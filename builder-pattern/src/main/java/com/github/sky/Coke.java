package com.github.sky;

/**
 * 描述：可口可乐实现类
 *
 * @author sukai
 * @date 2021/10/6
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 3.0f;
    }

    @Override
    public String name() {
        return "可口可乐";
    }
}
