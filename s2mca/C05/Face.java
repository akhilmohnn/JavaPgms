import javax.swing.*;
import java.awt.*;

public class Face extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawOval(100,100,250,250);
				
}
public static void main(String []args){
	JFrame frame=new JFrame("Face");
	frame.setSize(600,600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	Face panel=new Face();
	panel.setBackground(Color.yellow);

	frame.setContentPane(panel);
	frame.setVisible(true);
}
	
	}