package com.github.sky.Notification;

import com.github.sky.MsgSender;

/**
 * 描述：通知抽象类
 *
 * @author sukai
 * @date 2021/10/9
 */
public abstract class AbstractNotification {

    protected MsgSender msgSender;

    public AbstractNotification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);

}
