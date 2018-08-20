import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class Board extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        drawDonut(g);
    }

    public void drawDonut(Graphics g){
        Graphics2D g2d = (Graphics2D)g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        Dimension size = getSize();
        double width = size.getWidth();
        double height = size.getHeight();

        Rectangle2D rect = new Rectangle2D.Double(0, 0, 200, 100);

        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(new Color(255,0,0));
        AffineTransform at = AffineTransform.getTranslateInstance(width/2, height/2);
        for(int deg = 0; deg< 10; deg++) {
            at.rotate(Math.toRadians(50));
            g2d.draw(at.createTransformedShape(e));
        }
    }

}

