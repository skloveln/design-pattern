import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/27
 */
public class JunitTest {

    @Test
    public void test(){
        Originator originator = new Originator("# state 1");
        Caretaker caretaker = new Caretaker();
        originator.setState("# state 2");
        String memento1 = caretaker.addMemento(originator.createMemento());
        originator.setState("# state 3");
        String memento2 = caretaker.addMemento(originator.createMemento());
        originator.setState("# state 4");

        System.out.println("当前状态：" + originator.getState());
        originator.restoreFromMemento(caretaker.getMemento(memento1));
        System.out.println("回退到备份1, 状态：" + originator.getState());
        originator.restoreFromMemento(caretaker.getMemento(memento2));
        System.out.println("回退到备份2, 状态：" + originator.getState());
    }

}
