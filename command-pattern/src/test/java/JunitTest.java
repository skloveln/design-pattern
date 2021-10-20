import com.github.sky.Broker;
import com.github.sky.BuyStock;
import com.github.sky.SellStock;
import com.github.sky.Stock;
import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/20
 */
public class JunitTest {

    @Test
    public void test(){
        Stock stock = new Stock("贵州茅台", 100);
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
