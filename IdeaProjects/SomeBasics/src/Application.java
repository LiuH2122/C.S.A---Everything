import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Application extends JFrame{
    public Board gameBoard = new Board();

    public Application(){
        initUI();
    }

    public void initUI(){

        int bWidth = 800;
        int bHeight = 600;
        setSize(bWidth, bHeight);
        setTitle("Something small");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(gameBoard);
    }
    public void update() {
        this.repaint();

    }
    public static void main(String[] args) throws InterruptedException{
            Application ex = new Application();
            ex.setVisible(true);
            while(true) {
                ex.update();
                Thread.sleep(20);
            }
    }
}
