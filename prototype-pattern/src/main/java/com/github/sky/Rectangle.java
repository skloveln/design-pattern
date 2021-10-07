package com.github.sky;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 描述：长方形
 *
 * @author sukai
 * @date 2021/10/7
 */
@Setter
@Getter
public class Rectangle implements Shape {

    /**
     * 长度
     */
    private int length;
    /**
     * 宽度
     */
    private int width;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public BigDecimal countArea() {
        return new BigDecimal(length).multiply(new BigDecimal(width));
    }

    @Override
    public String getName() {
        return "长方形";
    }
}
