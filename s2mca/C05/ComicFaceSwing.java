import javax.swing.*;
import java.awt.*;

public class ComicFaceSwing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the face outline
        g.drawOval(100, 100, 250, 250);

        // Draw the left eye
        g.fillOval(170, 185, 25, 25);

        // Draw the right eye
        g.fillOval(255, 185, 25, 25);

        // Draw the smile
        g.drawArc(150, 215, 150, 100, 0, -180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Comic Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        ComicFaceSwing panel = new ComicFaceSwing();
        panel.setBackground(Color.red);  // Yellow background

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
