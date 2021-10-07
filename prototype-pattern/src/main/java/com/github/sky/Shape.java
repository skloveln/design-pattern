package com.github.sky;

import java.math.BigDecimal;

/**
 * 描述：图形形状
 *
 * @author sukai
 * @date 2021/10/7
 */
public interface Shape extends Cloneable {

    /**
     * 克隆
     *
     * @return
     */
    public Object clone();

    /**
     * 计算面积
     */
    public BigDecimal countArea();

    /**
     * 获取图形名称
     *
     * @return
     */
    public String getName();
}
