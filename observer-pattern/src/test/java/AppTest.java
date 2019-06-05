import com.github.sky.User;
import com.github.sky.WeChatServer;
import org.junit.Test;


public class AppTest {

    @Test
    public void test(){
        // 模拟微信订阅号
        WeChatServer weChatServer = new WeChatServer();
        // 模拟三个用户
        User user1 = new User("zhangsan");
        User user2 = new User("lisi");
        User user3 = new User("wangwu");
        // 订阅
        weChatServer.registerObserver(user1);
        weChatServer.registerObserver(user2);
        weChatServer.registerObserver(user3);
        // 推送消息
        weChatServer.notifyObserver();
        System.out.println("----------------------------");
        // 取消订阅
        weChatServer.removeObserver(user1);
        // 再次推送消息
        weChatServer.notifyObserver();
    }

}
