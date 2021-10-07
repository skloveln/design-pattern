package com.github.sky;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 描述：圆形
 *
 * @author sukai
 * @date 2021/10/7
 */
@Setter
@Getter
public class Circle implements Shape {

    /**
     * 半径长度
     */
    private int r;

    @Override
    public BigDecimal countArea() {
        return new BigDecimal(3.14).multiply(new BigDecimal(r));
    }

    @Override
    public String getName() {
        return "圆形";
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
