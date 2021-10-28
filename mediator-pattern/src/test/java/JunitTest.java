import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/28
 */
public class JunitTest {

    @Test
    public void test(){
        User robert = new User("Robert");
        User john = new User("John");
        User lisa = new User("Lisa");
        User jorge = new User("Jorge");

        ChatRoom.registerUser(robert);
        ChatRoom.registerUser(john);
        ChatRoom.registerUser(lisa);
        ChatRoom.registerUser(jorge);

        robert.sendMessage("Hi! EveryOne!");
        john.sendMessage("Hello! Guest!");
    }
}
