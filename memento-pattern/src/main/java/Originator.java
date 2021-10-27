import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

/**
 * 描述：使用者，发起人
 *
 * @author sukai
 * @date 2021/10/27
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Originator {

    private String state;

    /**
     * 创建备份
     *
     * @return 存储有状态值时，返回新建备份，没有状态值，返回空
     */
    public Memento createMemento() {
        if (StringUtils.isNotBlank(state)) {
            return new Memento(state);
        }
        return null;
    }

    /**
     * 从备份中恢复存储的状态值
     *
     * @param memento 备份对象
     */
    public void restoreFromMemento(Memento memento) {
        if (StringUtils.isNotBlank(memento.getState())) {
            this.state = memento.getState();
        }
    }
}
