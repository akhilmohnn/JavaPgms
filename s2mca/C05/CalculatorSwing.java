import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSwing extends JFrame implements ActionListener {
    JTextField t;
    double n1 = 0, n2 = 0, res = 0;
    int op = 0;

    public CalculatorSwing() {
        setTitle("Swing Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        t = new JTextField();
        t.setEditable(false);
        t.setFont(new Font("Arial", Font.BOLD, 18));
        add(t, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            ".", "0", "=", "+",
            "C"
        };

        for (String text : buttons) {
            JButton b = new JButton(text);
            b.setFont(new Font("Arial", Font.BOLD, 18));
            b.addActionListener(this);
            panel.add(b);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9\\.]")) {
            t.setText(t.getText() + cmd);
        } else if (cmd.equals("+")) {
            n1 = Double.parseDouble(t.getText());
            op = 1;
            t.setText("");
        } else if (cmd.equals("-")) {
            n1 = Double.parseDouble(t.getText());
            op = 2;
            t.setText("");
        } else if (cmd.equals("*")) {
            n1 = Double.parseDouble(t.getText());
            op = 3;
            t.setText("");
        } else if (cmd.equals("/")) {
            n1 = Double.parseDouble(t.getText());
            op = 4;
            t.setText("");
        } else if (cmd.equals("=")) {
            n2 = Double.parseDouble(t.getText());
            switch (op) {
                case 1: res = n1 + n2; break;
                case 2: res = n1 - n2; break;
                case 3: res = n1 * n2; break;
                case 4: res = n2 != 0 ? n1 / n2 : 0; break;
            }
            t.setText("" + res);
        } else if (cmd.equals("C")) {
            t.setText("");
        }
    }

    public static void main(String[] args) {
        new CalculatorSwing();
    }
}
