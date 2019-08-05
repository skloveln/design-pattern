import com.github.sky.Protocol;
import com.github.sky.ProtocolEnum;
import com.github.sky.ProtocolFactory;
import org.junit.Test;

public class JunitTest {

    @Test
    public void test(){
        // 获取工厂
        ProtocolFactory factory = ProtocolFactory.getFactory();
        // 获取协议
        Protocol protocol = factory.getProtocol(ProtocolEnum.TCP);
        protocol.connect();
        protocol = factory.getProtocol(ProtocolEnum.HTTP);
        protocol.connect();
        protocol = factory.getProtocol(ProtocolEnum.FTP);
        protocol.connect();
    }

}
