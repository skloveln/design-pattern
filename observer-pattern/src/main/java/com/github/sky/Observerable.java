package com.github.sky;

/**
 * 抽象的被观察者接口
 */
public interface Observerable {
    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    public void notifyObserver();

}
