package com.github.sky;


import lombok.Getter;
import lombok.Setter;

/**
 * 描述：游戏环境
 *
 * @author sukai
 * @date 2021/10/15
 */
@Setter
@Getter
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void nextState(){
        state.doAction(this);
    }
}
