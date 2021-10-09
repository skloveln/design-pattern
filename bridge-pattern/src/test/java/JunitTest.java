import com.github.sky.BusinessMonitor;
import com.github.sky.NotificationEmergencyLevel;
import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/9
 */
public class JunitTest {

    @Test
    public void test() {
        BusinessMonitor businessMonitor = new BusinessMonitor();
        businessMonitor.notify(NotificationEmergencyLevel.TRIVIAL, "项目正常运行");
        businessMonitor.notify(NotificationEmergencyLevel.NORMAL, "产生一个警告");
        businessMonitor.notify(NotificationEmergencyLevel.URGENCY, "出现一个异常");
    }

}
