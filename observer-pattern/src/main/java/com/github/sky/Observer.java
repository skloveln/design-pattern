package com.github.sky;

/**
 * 抽象的观察者接口
 */
public interface Observer {

    /**
     * 接收消息更新
     * @param message
     */
    public void update(String message);

}
