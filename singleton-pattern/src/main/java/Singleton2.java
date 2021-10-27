

/**
 * 懒汉式
 *
 * @author sukai
 * @date 2018/08/27
 */
public class Singleton2 {

    private static Singleton2 singleton = null;

    private Singleton2() {

    }

    public synchronized static Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }

    public static void doSomething(String[] args) {
        //业务方法
    }
}
