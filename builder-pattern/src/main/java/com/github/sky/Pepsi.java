package com.github.sky;

/**
 * 描述：百事可乐实现类
 *
 * @author sukai
 * @date 2021/10/6
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 2.5f;
    }

    @Override
    public String name() {
        return "百事可乐";
    }
}
