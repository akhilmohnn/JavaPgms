import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LargestSwing extends JFrame implements ActionListener {
    JTextField n1, n2, n3;
    JLabel max;

    public LargestSwing() {
        setTitle("Maximum of 3 Values");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));
        setLocationRelativeTo(null);  // Center the window

        // Input for number 1
        add(new JLabel("NUMBER 1:"));
        n1 = new JTextField(10);
        add(n1);

        // Input for number 2
        add(new JLabel("NUMBER 2:"));
        n2 = new JTextField(10);
        add(n2);

        // Input for number 3
        add(new JLabel("NUMBER 3:"));
        n3 = new JTextField(10);
        add(n3);

        // Button and result label
        JButton findMax = new JButton("Find Maximum");
        findMax.addActionListener(this);
        add(findMax);

        max = new JLabel("Maximum is: ");
        add(max);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(n1.getText());
            int b = Integer.parseInt(n2.getText());
            int c = Integer.parseInt(n3.getText());

            int maxN=a;
            if (b>a)
                maxN = b;
            if (c > a)
                maxN = b;
            

            max.setText("Maximum is: " + maxN);
        } catch (NumberFormatException ex) {
            max.setText("Enter valid integers!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LargestSwing());
    }
}
