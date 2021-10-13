/**
 * 描述：节点抽象类
 *
 * @author sukai
 * @date 2021/10/13
 */
public abstract class AbstractNode {

    private String path;

    public AbstractNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();

    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }

    public void printPath() {
        System.out.println(path);
    }
}
