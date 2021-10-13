import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/13
 */
public class JunitTest {

    @Test
    public void test(){
        DirectoryNode directoryNode = new DirectoryNode("/");
        DirectoryNode directoryNode1 = new DirectoryNode("/a");
        directoryNode.addSubNode(directoryNode1);
        FileNode fileNode1 = new FileNode("/a/1.txt");
        FileNode fileNode2 = new FileNode("/a/2.txt");
        directoryNode.addSubNode(fileNode1);
        directoryNode.addSubNode(fileNode2);
        DirectoryNode directoryNode2 = new DirectoryNode("/a/b");
        directoryNode.addSubNode(directoryNode2);
        FileNode fileNode3 = new FileNode("/a/b/1.txt");
        FileNode fileNode4 = new FileNode("/a/b/2.txt");
        directoryNode.addSubNode(fileNode3);
        directoryNode.addSubNode(fileNode4);

        System.out.println("文件个数:" + directoryNode.countNumOfFiles());
        directoryNode.printPath();
    }

}
