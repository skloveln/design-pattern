import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/25
 */
public class JunitTest {

    @Test
    public void test(){
        String expression = "2 + 3 - 6 + 7";
        ExpressionInterpreter expressionInterpreter = new ExpressionInterpreter(expression);
        long result = expressionInterpreter.interpret();
        System.out.println(expression + " = " + result);
    }

}
