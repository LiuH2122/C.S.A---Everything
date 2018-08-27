import javax.swing.*;
import java.awt.*;

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
        Board gameBoard = new Board();
        add(gameBoard);
    }
    public void update() {
        gameBoard.repaint();

    }
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            Application ex = new Application();
            while (true) {
                ex.update();
                Thread.sleep(10);
            }
            ex.setVisible(true);

        });
    }
}
