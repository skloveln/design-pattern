package com.github.sky;

import com.github.sky.Notification.NormalNotification;
import com.github.sky.Notification.TrivialNotification;
import com.github.sky.Notification.UrgencyNotification;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 描述：业务监控
 *
 * Notification 类相当于抽象，MsgSender 类相当于实现，两者可以独立开发，通过组合关系（也就是桥梁）任意组合在一起。
 * 所谓任意组合的意思就是，不同紧急程度的消息和发送渠道之间的对应关系，不是在代码中固定写死的，
 * 我们可以动态地去指定（比如，通过读取配置来获取对应关系）。
 *
 * @author sukai
 * @date 2021/10/9
 */
public class BusinessMonitor {

    private TrivialNotification trivialNotification;
    private NormalNotification normalNotification;
    private UrgencyNotification urgencyNotification;

    private List<String> managerEmail = Arrays.asList("manager@email.com", "monitor@email.com");
    private List<String> managerWechatGuid = Collections.singletonList("uuguid_wechat");
    private List<String> managerTelephone = Arrays.asList("134xxxxxxxx", "156xxxxxxxx");

    /**
     * 根据报警级别发送指定通知
     *
     * @param level   报警级别
     * @param message 消息内容
     */
    public void notify(NotificationEmergencyLevel level, String message) {
        if (NotificationEmergencyLevel.TRIVIAL == level) {
            if (trivialNotification == null) {
                EmailMsgSender emailMsgSender = new EmailMsgSender(managerEmail);
                trivialNotification = new TrivialNotification(emailMsgSender);
            }
            trivialNotification.notify(message);
        } else if (NotificationEmergencyLevel.NORMAL == level) {
            if (normalNotification == null) {
                WechatMsgSender wechatMsgSender = new WechatMsgSender(managerWechatGuid);
                normalNotification = new NormalNotification(wechatMsgSender);
            }
            normalNotification.notify(message);
        } else if (NotificationEmergencyLevel.URGENCY == level) {
            if (urgencyNotification == null) {
                TelephoneMsgSender telephoneMsgSender = new TelephoneMsgSender(managerTelephone);
                urgencyNotification = new UrgencyNotification(telephoneMsgSender);
            }
            urgencyNotification.notify(message);
        }
    }

}
