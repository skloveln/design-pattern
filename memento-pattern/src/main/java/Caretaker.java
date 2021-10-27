import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 描述：备份管理者
 *
 * @author sukai
 * @date 2021/10/27
 */
public class Caretaker {

    private Map<String, Memento> map = new HashMap<>();

    /**
     * 存储备份
     *
     * @param memento 备份
     * @return 备份的编号
     */
    public String addMemento(Memento memento) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        map.put(uuid, memento);
        return uuid;
    }

    /**
     * 获取备份
     *
     * @param uuid 备份编号
     * @return
     */
    public Memento getMemento(String uuid){
        return map.get(uuid);
    }
}
