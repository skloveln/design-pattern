package com.github.sky;

/**
 * 描述：消息发送接口
 *
 * @author sukai
 * @date 2021/10/9
 */
public interface MsgSender {

    /**
     * 发送消息
     *
     * @param message
     */
    void send(String message);

}
