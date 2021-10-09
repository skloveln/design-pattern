package com.github.sky.Notification;

import com.github.sky.MsgSender;

/**
 * 描述：普通的通知
 *
 * @author sukai
 * @date 2021/10/9
 */
public class NormalNotification extends AbstractNotification {

    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        System.out.println("[普通级别]");
        msgSender.send(message);
    }

}
