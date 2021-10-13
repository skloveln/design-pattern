
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：目录节点
 *
 * @author sukai
 * @date 2021/10/13
 */
public class DirectoryNode extends AbstractNode {

    private List<AbstractNode> subNodes = new ArrayList<>();

    public DirectoryNode(String path) {
        super(path);
        if(StringUtils.isBlank(path)){
            throw new RuntimeException("路径不能为空");
        }
    }

    @Override
    public int countNumOfFiles() {
        return subNodes.stream().mapToInt(AbstractNode::countNumOfFiles).sum();
    }

    @Override
    public long countSizeOfFiles() {
        return subNodes.stream().mapToLong(AbstractNode::countSizeOfFiles).sum();
    }

    @Override
    public void printPath() {
        super.printPath();
        for (int i = 0; i < subNodes.size(); i++) {
            subNodes.get(i).printPath();
        }
    }

    /**
     * 增加子节点
     *
     * @param fileOrDir
     */
    public void addSubNode(AbstractNode fileOrDir) {
        if (fileOrDir.getPath() != null && fileOrDir.getPath().startsWith(getPath())) {
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
    public void removeSubNode(AbstractNode fileOrDir) {
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
