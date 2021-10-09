package com.github.sky;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述：邮件发送通知实现类
 *
 * @author sukai
 * @date 2021/10/9
 */
public class EmailMsgSender implements MsgSender {


    private List<String> emailAddresses;

    public EmailMsgSender(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @Override
    public void send(String message) {
        System.out.println("发邮件通知" + emailAddresses.stream().collect(Collectors.joining(",")) + ": " + message);
    }

}