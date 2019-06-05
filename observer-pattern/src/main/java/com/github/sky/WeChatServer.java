package com.github.sky;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者（eg：微信订阅号）
 */
public class WeChatServer implements Observerable{

    private List<Observer> list = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(!list.isEmpty()){
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : this.list){
            observer.update("hello world!");
        }
    }
}
