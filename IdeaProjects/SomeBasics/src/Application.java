import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Application extends JFrame{
    public Board gboard;
    public Application(){

        this.gboard = new Board();
        initUI(gboard);

    }

    public void initUI(Board bo){

        int bWidth = 800;
        int bHeight = 600;
        setSize(bWidth, bHeight);
        setTitle("Something small");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(bo);
    }

    public static void main(String[] args) throws InterruptedException{
        Application ex = new Application();
            ex.setVisible(true);
            ex.gboard.init();
            while(true) {
                ex.gboard.updateBoard();
                Thread.sleep(20);
            }
    }
}
