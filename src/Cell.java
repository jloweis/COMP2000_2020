import java.awt.*;

class Cell{
    // fields
    int x;
    int y;
    static int size = 35;
    char col;
    int row;

    //constructors
<<<<<<< HEAD
    public Cell(char col, int row, int x, int y){
        super(x,y,size,size);
        this.col = col;
        this.row = row;
=======
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
>>>>>>> parent of 7e914d5... solutions to tasks 6, 7, 8, and 9
    }

    //methods
    void paint(Graphics g, Point mousePos){
        if(contains(mousePos)){
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
    }

    boolean contains(Point p){
        if (p != null){
            return (x < p.x && x+size > p.x && y < p.y && y+size > p.y);
        } else {
            return false;
        }
    }
}