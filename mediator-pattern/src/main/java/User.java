import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 描述：用户
 *
 * @author sukai
 * @date 2021/10/28
 */
@Setter
@Getter
@AllArgsConstructor
public class User {

    private String name;

    /**
     * 发消息
     *
     * @param message 消息文本
     */
    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
