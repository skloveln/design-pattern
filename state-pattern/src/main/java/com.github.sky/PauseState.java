package com.github.sky;

/**
 * 描述：游戏暂停
 *
 * @author sukai
 * @date 2021/10/15
 */
public class PauseState implements State {

    @Override
    public void doAction(Context context) {
        context.setState(new StopState());
    }

    @Override
    public String toString() {
        return "Player is in pause state";
    }

}
