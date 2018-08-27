package com.github.sky;

/**
 * 枚举的方式创建
 */
public enum Singleton5 {
    INSTANCE;

    private Resource single = null;

    Singleton5(){
        single = new Resource();
    }

    public Resource getInstance() {
        return single;
    }
}
