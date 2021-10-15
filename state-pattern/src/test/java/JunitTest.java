import com.github.sky.Context;
import com.github.sky.StartState;
import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/15
 */
public class JunitTest {

    @Test
    public void test(){
        Context context = new Context(new StartState());
        System.out.println(context.getState().toString());
        context.nextState();
        System.out.println(context.getState().toString());
        context.nextState();
        System.out.println(context.getState().toString());
        context.nextState();
        System.out.println(context.getState().toString());
    }
}
