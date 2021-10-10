import com.github.sky.Circle;
import com.github.sky.Rectangle;
import com.github.sky.RedShapeDecorator;
import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/10
 */
public class JunitTest {

    @Test
    public void test() {
        RedShapeDecorator redShapeDecorator1 = new RedShapeDecorator(new Circle());
        redShapeDecorator1.draw();

        RedShapeDecorator redShapeDecorator2 = new RedShapeDecorator(new Rectangle());
        redShapeDecorator2.draw();
    }


}
