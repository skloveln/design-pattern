package com.github.sky;

/**
 * 描述：食物条目和食物包装的接口
 *
 * @author sukai
 * @date 2021/10/6
 */
public interface Item {

    /**
     * 获取食物名称
     *
     * @return
     */
    public String name();

    /**
     * 获取食物包装方式
     *
     * @return
     */
    public Packing packing();

    /**
     * 获取食物价格
     *
     * @return
     */
    public float price();

}
