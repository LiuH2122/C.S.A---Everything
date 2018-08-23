import javax.swing.*;
import java.awt.EventQueue;

public class Application extends JFrame{
    public Application(){
        initUI();
    }

    public void initUI(){
        int bWidth = 800;
        int bHeight = 600;
        add(new Board());
        setSize(bWidth, bHeight);
        setTitle("Something small");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            Application ex = new Application();
            ex.setVisible(true);

        });
    }
}
