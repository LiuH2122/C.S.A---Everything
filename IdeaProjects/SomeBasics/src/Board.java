import javax.swing.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Board extends JPanel{
    public static double exvar = 0;
    public static Map<String, Double> map = new HashMap<String, Double>();
    public static gameComponent[] allGameComponents = new gameComponent[ 2 ];

    public void init(){
        Dimension size = getSize();
        double screenW = size.getWidth();
        double screenH = size.getHeight();
        Color gray = new Color(225, 223, 230);
        gameComponent base = new gameComponent(0, (screenH / 3) * 2, screenW, screenH / 3, gray);

        gameComponent platform = new gameComponent(50, 100, screenW / 3, 20, gray);
        allGameComponents[0] = base;
        base.speedX = 1;
        allGameComponents[1] = platform;
    }
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        for (int i = 0; i < allGameComponents.length; i++) {
            allGameComponents[i].update();

            allGameComponents[i].draw(g);
        }
    }


    public class gameComponent{
        public double x;
        public double width;
        public double y;
        public double height;
        public double speedX;
        public double speedY;
        public Color color;



        gameComponent(double x, double y, double w, double h, Color color){
            this.width = w;
            this.y = y;
            this.height = h;
            this.color = color;
            this.x = x;
            System.out.println("test");

        }

        public void draw(Graphics g){

            Graphics2D g2d = (Graphics2D)g;
            RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g2d.setRenderingHints(rh);
            Rectangle2D rect = new Rectangle2D.Double(this.x, this.y, this.width, this.height);
            g2d.setPaint(this.color);
            g2d.fill(rect);

        }
        public void update(){
            this.x+=speedX;
        }
    }
    public int toInt(Double db){
        int newDb = (int) Math.round(db);
        return newDb;
    }

    public void updateBoard(){
        repaint();
    }

}

