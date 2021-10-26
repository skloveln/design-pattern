/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/26
 */
public class Display implements ComputerVisitor {

    public void visit(Monitor monitor) {
        System.out.println("Displaying " + monitor.toString());
    }

    public void visit(KeyBoard keyBoard) {
        System.out.println("Displaying " + keyBoard.toString());
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying " + mouse.toString());
    }

    public void visit(Computer computer) {
        System.out.println("Displaying " + computer.toString());
    }

    @Override
    public void visit(ComputerPart computerPart) {
        if (computerPart instanceof KeyBoard) {
            visit((KeyBoard) computerPart);
        } else if (computerPart instanceof Mouse) {
            visit((Mouse) computerPart);
        } else if (computerPart instanceof Monitor) {
            visit((Monitor) computerPart);
        } else if (computerPart instanceof Computer) {
            visit((Computer) computerPart);
        }
    }
}
