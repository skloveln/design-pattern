package com.github.sky.Notification;

import com.github.sky.MsgSender;

/**
 * 描述：无关紧要的通知
 *
 * @author sukai
 * @date 2021/10/9
 */
public class TrivialNotification extends AbstractNotification {

    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        System.out.println("[无关紧要级别]");
        msgSender.send(message);
    }
}
