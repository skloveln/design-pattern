package com.github.sky;

/**
 * 描述：游戏结束
 *
 * @author sukai
 * @date 2021/10/15
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        context.setState(new StartState());
    }

    @Override
    public String toString(){
        return "Player is in stop state";
    }
}
