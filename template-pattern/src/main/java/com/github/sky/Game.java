package com.github.sky;

/**
 * 描述：抽象游戏类
 *
 * @author sukai
 * @date 2021/10/18
 */
public abstract class Game {

    /**
     * 模板方法
     */
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    /**
     * 初始化游戏
     */
    abstract void initialize();

    /**
     * 开始游戏
     */
    abstract void startPlay();

    /**
     * 结束游戏
     */
    abstract void endPlay();

}