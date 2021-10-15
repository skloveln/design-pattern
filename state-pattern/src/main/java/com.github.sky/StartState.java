package com.github.sky;

/**
 * 描述：游戏开始
 *
 * @author sukai
 * @date 2021/10/15
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        context.setState(new PauseState());
    }

    @Override
    public String toString() {
        return "Player is in start state";
    }
}
