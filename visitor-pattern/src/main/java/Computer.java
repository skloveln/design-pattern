import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/26
 */
public class Computer implements ComputerPart {

    private List<ComputerPart> list = new ArrayList<>();

    public Computer(){
        list.add(new KeyBoard());
        list.add(new Monitor());
        list.add(new Mouse());
    }

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        for (ComputerPart computerPart : list) {
            computerPart.accept(computerVisitor);
        }
        computerVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "计算机";
    }
}
