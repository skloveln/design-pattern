package com.github.sky;

/**
 * 描述：红色图形
 *
 * @author sukai
 * @date 2021/10/10
 */
public class RedShapeDecorator extends BaseShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    /**
     * 设置绘制图形线条的颜色
     *
     * @param shape
     */
    private void setRedBorder(Shape shape) {
        System.out.println("Border Color: Red");
    }
}
