/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/26
 */
public class Monitor implements ComputerPart{

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        computerVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "显示屏";
    }
}
