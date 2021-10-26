import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/26
 */
public class JunitTest {

    @Test
    public void test() {
        Computer computer = new Computer();
        computer.accept(new Display());
    }
}
