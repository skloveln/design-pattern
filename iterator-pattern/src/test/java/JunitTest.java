import com.github.sky.StringArrayIterator;
import org.junit.Test;

import java.util.Iterator;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/21
 */
public class JunitTest {

    @Test
    public void test(){
        String[] strings = new String[]{"zhangsan", "lisi", "wangwu", "zhaoliu"};
        for(Iterator iterator = new StringArrayIterator(strings); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }

}
