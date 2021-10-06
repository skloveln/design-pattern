package com.github.sky;

/**
 * 描述：纸袋包装方式
 *
 * @author sukai
 * @date 2021/10/6
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "纸袋包装";
    }
}
