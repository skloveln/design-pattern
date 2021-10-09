package com.github.sky.Notification;

import com.github.sky.MsgSender;

/**
 * 描述：紧急通知
 *
 * @author sukai
 * @date 2021/10/9
 */
public class UrgencyNotification extends AbstractNotification {

    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        System.out.println("[紧急级别]");
        msgSender.send(message);
    }
}
