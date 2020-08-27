<<<<<<< HEAD
import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    
    class App extends JPanel {
        
        Stage stage;

        public App() {
            setPreferredSize(new Dimension(880, 720));
            stage = StageReader.readStage("data/stage1.rvb");
        }

        @Override
        public void paint(Graphics g) {
            stage.paint(g, getMousePosition());
        }

    }

=======
public class Main {
>>>>>>> parent of 0240e12... tasks 3, 4, and 5 solutions
    public static void main(String[] args) throws Exception {
        System.out.println("Red vs. Blue");
    }
}