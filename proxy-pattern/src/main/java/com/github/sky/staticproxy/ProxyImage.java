package com.github.sky.staticproxy;

/**
 * 描述：图片代理类
 *
 * @author sukai
 * @date 2021/10/11
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
