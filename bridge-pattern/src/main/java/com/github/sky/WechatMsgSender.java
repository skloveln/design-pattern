package com.github.sky;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述：微信消息通知实现类
 *
 * @author sukai
 * @date 2021/10/9
 */
public class WechatMsgSender implements MsgSender {

    private List<String> wechatIds;

    public WechatMsgSender(List<String> wechatIds) {
        this.wechatIds = wechatIds;
    }

    @Override
    public void send(String message) {
        System.out.println("发微信通知" + wechatIds.stream().collect(Collectors.joining(",")) + ": " + message);
    }

}
