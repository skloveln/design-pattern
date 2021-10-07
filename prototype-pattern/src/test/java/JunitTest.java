import com.github.sky.Circle;
import com.github.sky.Rectangle;
import com.github.sky.ShapeEnum;
import com.github.sky.ShapeManager;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/7
 */
public class JunitTest {

    @Test
    public void test(){
        Circle shape1 = (Circle) ShapeManager.getShape(ShapeEnum.CIRCLE);
        System.out.println("图形一的名称：" + shape1.getName());
        shape1.setR(2);
        System.out.println("图形一的面积：" + shape1.countArea().setScale(2, BigDecimal.ROUND_HALF_UP).toString());

        Rectangle shape2 = (Rectangle) ShapeManager.getShape(ShapeEnum.RECTANGLE);
        System.out.println("图形二的名称：" + shape2.getName());
        shape2.setLength(2);
        shape2.setWidth(3);
        System.out.println("图形二的面积：" + shape2.countArea().toString());


        Circle shape3 = (Circle) ShapeManager.getShape(ShapeEnum.CIRCLE);
        System.out.println("图形三的名称：" + shape3.getName());
        shape3.setR(3);
        System.out.println("图形三的面积：" + shape3.countArea().setScale(2, BigDecimal.ROUND_HALF_UP).toString());

    }
}
