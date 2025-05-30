import java.awt.*;
public class Shapes extends Frame {
 public Shapes()
 {
 setVisible(true);
 setSize(300, 300);

 }
 public void paint(Graphics g)
 {
 g.drawString("Welcome",50,50);
 g.drawLine(20,30,20,300);
 g.drawRect(50, 60, 50, 20);
 g.drawRoundRect(50, 90, 50, 20, 10, 10);
 g.fillRect(50, 120, 50, 20);
 g.fillRoundRect(50, 150, 50, 20, 10, 10);
 }
 public static void main(String[] args)
 {
 new Shapes();
 }
}
