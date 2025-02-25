import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class HouseApplet extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.cyan);

        g.setColor(Color.gray);
        g.fillRect(100, 150, 200, 150);

        int[] xPoints = {100, 200, 300};
        int[] yPoints = {150, 50, 150};
        g.setColor(Color.red);
        g.fillPolygon(xPoints, yPoints, 3);

        g.setColor(Color.blue);
        g.fillRect(180, 220, 40, 80);

        g.setColor(Color.yellow);
        g.fillRect(130, 170, 40, 40);
        g.fillRect(230, 170, 40, 40);
    }
}