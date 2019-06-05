package com.github.sky;

/**
 * 具体的观察者（eg：微信用户）
 */
public class User implements Observer{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + "收到了一条消息：" + message);
    }
}
