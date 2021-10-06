package com.github.sky;

/**
 * 描述：纸盒包装方式
 *
 * @author sukai
 * @date 2021/10/6
 */
public class Bottle implements Packing{

    @Override
    public String pack() {
        return "纸盒包装";
    }
}
