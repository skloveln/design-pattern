package com.github.sky;

/**
 * 描述：汉堡抽象类
 *
 * @author sukai
 * @date 2021/10/6
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
