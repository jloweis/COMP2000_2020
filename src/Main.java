import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    
    class App extends JPanel {
        
        Grid grid;
        Stage stage;

        public App() {
            setPreferredSize(new Dimension(720, 720));
            grid = new Grid();
            stage = new Stage();
        }

        @Override
        public void paint(Graphics g) {
            grid.paint(g, getMousePosition());
            stage.paint(g, getMousePosition());
        }

    }