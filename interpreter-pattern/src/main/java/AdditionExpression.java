import lombok.AllArgsConstructor;

/**
 * 描述：加法运算
 *
 * @author sukai
 * @date 2021/10/25
 */
@AllArgsConstructor
public class AdditionExpression implements Expression {

    private long e1;
    private long e2;

    @Override
    public long interpret() {
        return e1 + e2;
    }
}
