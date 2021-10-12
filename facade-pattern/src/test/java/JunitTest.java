import com.github.sky.ShapeMaker;
import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/12
 */
public class JunitTest {

    @Test
    public void test(){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
