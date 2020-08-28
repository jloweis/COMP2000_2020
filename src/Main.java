import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    
    class App extends JPanel {
        
        Grid grid;
<<<<<<< HEAD
        Stage stage;
=======
>>>>>>> parent of 7e914d5... solutions to tasks 6, 7, 8, and 9

        public App() {
            setPreferredSize(new Dimension(720, 720));
            grid = new Grid();
<<<<<<< HEAD
            stage = new Stage();
=======
>>>>>>> parent of 7e914d5... solutions to tasks 6, 7, 8, and 9
        }

        @Override
        public void paint(Graphics g) {
            grid.paint(g, getMousePosition());
<<<<<<< HEAD
            stage.paint(g, getMousePosition());
=======
>>>>>>> parent of 7e914d5... solutions to tasks 6, 7, 8, and 9
        }

    }