import com.github.sky.Cricket;
import com.github.sky.Football;
import com.github.sky.Game;
import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/18
 */
public class JunitTest {

    @Test
    public void test(){
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
