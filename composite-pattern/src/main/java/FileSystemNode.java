import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 需求：原始文件系统树结构，利用组合模式进行改造
 *
 * @author sukai
 * @date 2021/10/13
 */

public class FileSystemNode {
    /**
     * 节点路径
     */
    private String path;
    /**
     * 是否是文件
     */
    private boolean isFile;
    /**
     * 子节点集合
     */
    private List<FileSystemNode> subNodes = new ArrayList<>();

    public FileSystemNode(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }

    public String getPath() {
        return path;
    }

    /**
     * 该节点文件的总数量
     *
     * @return
     */
    public int countNumOfFiles() {
        if (isFile) {
            return 1;
        } else {
            return subNodes.stream().mapToInt(FileSystemNode::countNumOfFiles).sum();
        }
    }

    /**
     * 该节点文件的总大小
     *
     * @return
     */
    public long countSizeOfFiles() {
        if (isFile) {
            File file = new File(path);
            return !file.exists() ? 0 : file.length();
        } else {
            return subNodes.stream().mapToLong(FileSystemNode::countSizeOfFiles).sum();
        }
    }

    /**
     * 增加子节点
     *
     * @param fileOrDir
     */
    public void addSubNode(FileSystemNode fileOrDir) {
        if (fileOrDir.getPath() != null && fileOrDir.getPath().startsWith(path)) {
            if (subNodes.stream().noneMatch(x -> x.getPath().equals(fileOrDir.getPath()))) {
                subNodes.add(fileOrDir);
            }
        }
    }

    /**
     * 删除子节点
     *
     * @param fileOrDir
     */
    public void removeSubNode(FileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (; i < size; ++i) {
            if (subNodes.get(i).getPath().equals(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }
}
