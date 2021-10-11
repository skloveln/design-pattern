import com.github.sky.dynamicproxy.DynamicProxy;
import com.github.sky.staticproxy.Image;
import com.github.sky.staticproxy.ProxyImage;
import com.github.sky.staticproxy.RealImage;
import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/11
 */
public class JunitTest {

    @Test
    public void test(){
        // 静态代理
        Image image = new ProxyImage("F:\\image.png");
        image.display();

        // 动态代理
        DynamicProxy dynamicProxyImage = new DynamicProxy();
        Image image1 = (Image) dynamicProxyImage.createProxy(new RealImage("F:\\image.png"));
        image1.display();
    }

}
