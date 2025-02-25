//appletcode laughface.java
import java.applet.*;
import java.awt.*;
public class laughface extends Applet
{
 public void paint(Graphics g)
{
 g.drawOval(100,100,200,200); //head
 g.drawOval(130,150,50,25);// left eye
 g.setColor(Color.black);
 g.fillOval(145,153,20,20);// left eye pupil
 g.drawOval(220,150,50,25);//right eye
 g.setColor(Color.black);
 g.fillOval(235,153,20,20);//right eye pupil
 g.drawOval(190,180,25,25);//nose
 g.drawOval(80,180,20,30);//left ear
 g.drawOval(300,180,20,30);//right ear
 g.setColor(Color.red); //mouth
 g.fillArc(150,200,100,50,180,180);
}
}

//laughface.html
<html>
<body>
<applet code="laughface.class" width=400 
height=400>
</applet>
</body> 
</html>