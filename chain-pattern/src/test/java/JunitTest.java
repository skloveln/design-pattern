import com.github.sky.AbstractLogger;
import com.github.sky.ConsoleLogger;
import com.github.sky.ErrorLogger;
import com.github.sky.FileLogger;
import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/19
 */
public class JunitTest {

    @Test
    public void test(){
        AbstractLogger loggerChain = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);

        fileLogger.setNextLogger(consoleLogger);
        loggerChain.setNextLogger(fileLogger);

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }

}
