<<<<<<< HEAD
import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    
    class App extends JPanel {
        
        Grid grid;

        public App() {
<<<<<<< HEAD
            setPreferredSize(new Dimension(880, 720));
            stage = StageReader.readStage("data/stage1.rvb");
=======
            setPreferredSize(new Dimension(720, 720));
            grid = new Grid();
>>>>>>> parent of 7e914d5... solutions to tasks 6, 7, 8, and 9
        }

        @Override
        public void paint(Graphics g) {
            grid.paint(g, getMousePosition());
        }

    }

=======
public class Main {
>>>>>>> parent of 0240e12... tasks 3, 4, and 5 solutions
    public static void main(String[] args) throws Exception {
        System.out.println("Red vs. Blue");
    }
}