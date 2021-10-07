package com.github.sky;

import java.util.HashMap;

/**
 * 描述：图形管理器
 *
 * @author sukai
 * @date 2021/10/7
 */
public class ShapeManager {

    private static HashMap<ShapeEnum, Shape> map = new HashMap<>();

    static {
        map.put(ShapeEnum.CIRCLE, new Circle());
        map.put(ShapeEnum.RECTANGLE, new Rectangle());
    }

    public static Shape getShape(ShapeEnum shapeEnum) {
        return (Shape) map.get(shapeEnum).clone();
    }

}
