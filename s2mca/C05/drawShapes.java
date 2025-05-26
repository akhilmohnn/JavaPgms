import javax.swing.*;
import java.awt.*;

public class drawShapes extends JPanel{
	protected void paintComponent(Graphics g){

        super.paintComponent(g);
	g.drawRect(50,50,100,100);
    g.drawOval(200,50 ,100, 100);
    g.fillOval(200,200, 100, 100);
    g.drawLine(100, 100, 88, 23);
	}	

    public static void main(String []args){
        JFrame frame=new JFrame("Shapes drawing");
        drawShapes panel=new drawShapes();

        frame.setSize(400,300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}