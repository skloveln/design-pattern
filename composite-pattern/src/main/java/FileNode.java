import java.io.File;

/**
 * 描述：文件节点
 *
 * @author sukai
 * @date 2021/10/13
 */
public class FileNode extends AbstractNode {

    public FileNode(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        return 1;
    }

    @Override
    public long countSizeOfFiles() {
        File file = new File(getPath());
        return !file.exists() ? 0 : file.length();
    }

}
