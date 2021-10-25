
import org.apache.commons.lang3.StringUtils;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 描述：数字加减法运算
 *
 *  规则： 数字 + 空格 + 加减运算符 + 空格 + 数字 + ...
 *  eg：2 + 5 - 6 + 2
 *
 * @author sukai
 * @date 2021/10/25
 */
public class ExpressionInterpreter implements Expression {

    private Deque<String> symbols = new LinkedList<>();

    private Deque<Long> numbers = new LinkedList<>();

    public ExpressionInterpreter(String expression) {
        String[] strArray = expression.split("");
        for (String string : strArray) {
            if (StringUtils.isNumeric(string)) {
                numbers.addLast(Long.parseLong(string));
            } else if ("+".equals(string) || "-".equals(string)) {
                symbols.addLast(string);
            } else {
                throw new RuntimeException("错误的表达式");
            }
        }
    }

    @Override
    public long interpret() {
        long result = numbers.pollFirst();
        while (!symbols.isEmpty()) {
            String symbol = symbols.pollFirst();
            if ("+".equals(symbol)) {
                result = new AdditionExpression(result, numbers.pollFirst()).interpret();
            } else {
                result = new SubtractionExpression(result, numbers.pollFirst()).interpret();
            }
        }
        return result;
    }
}
