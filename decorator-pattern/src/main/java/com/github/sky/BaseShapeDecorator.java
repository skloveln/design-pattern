package com.github.sky;

/**
 * 描述：图形装饰类
 *
 * @author sukai
 * @date 2021/10/10
 */
public abstract class BaseShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public BaseShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
