import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述：聊天室
 *
 * @author sukai
 * @date 2021/10/28
 */
public class ChatRoom {

    private static List<User> list = new ArrayList<>();

    /**
     * 注册用户
     *
     * @param user 用户信息
     */
    public static void registerUser(User user){
        list.add(user);
    }

    /**
     * 展示消息
     *
     * @param user    用户
     * @param message 消息
     */
    public static void showMessage(User user, String message) {
        String now = DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
        System.out.println(now + " [" + user.getName() + "] : " + message);
        String others = list.stream().map(User::getName)
                .filter(x -> !x.equals(user.getName()))
                .collect(Collectors.joining(","));
        System.out.println(others + " receive msg.");
    }

}
