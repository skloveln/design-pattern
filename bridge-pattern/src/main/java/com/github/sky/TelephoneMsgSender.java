package com.github.sky;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述：电话通知实现类
 *
 * @author sukai
 * @date 2021/10/9
 */
public class TelephoneMsgSender implements MsgSender {

    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        System.out.println("打电话通知" + telephones.stream().collect(Collectors.joining(",")) + ": " + message);
    }
}
