import com.github.sky.Context;
import com.github.sky.OperationAdd;
import com.github.sky.OperationMultiply;
import com.github.sky.OperationSubtract;
import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/16
 */
public class JunitTest {

    @Test
    public void test() {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}
