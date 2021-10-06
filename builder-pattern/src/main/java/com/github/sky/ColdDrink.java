package com.github.sky;

/**
 * 描述：冷饮抽象类
 *
 * @author sukai
 * @date 2021/10/6
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
