import javax.swing.*;
import java.awt.*;

public class SwingShapes extends JFrame{

SwingShapes(){
setTitle("Shapes window");
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

add(new SwingPanel());

setVisible(true);

	}

public class SwingPanel extends JPanel{
	
protected void paintComponent(Graphics g){
super.paintComponent(g);
	
g.drawLine(150,60,200,150);
g.drawLine(150,60,100,150);
g.fillOval(100,145,100,20);



g.drawRoundRect(120,220,100,100,30,30);
g.drawRect(220,120,100,100);
}

	}

public static void main(String args[]){

new SwingShapes();

	}




	}