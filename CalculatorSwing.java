import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import javax.swing.SwingConstants;

public class CalculatorSwing implements ActionListener {

    boolean isOpertorClicked=false;
    String oldValue;

    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton twoButton;
    JButton oneButton;
    JButton threeButton;
    JButton mulButton;
    JButton addButton,clearButton;
    JButton subButton;
    JButton divButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    

    public CalculatorSwing() {
        jf = new JFrame();
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setForeground(Color.WHITE);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(140, 130, 80, 80);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(250, 130, 80, 80);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(140, 230, 80, 80);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(250, 230, 80, 80);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(140, 330, 80, 80);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(250, 330, 80, 80);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(140, 430, 80, 80);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(250, 430, 80, 80);
        equalButton.addActionListener(this);
        jf.add(equalButton);

        addButton = new JButton("+");
        addButton.setBounds(360, 130, 80, 80);
        addButton.addActionListener(this);
        jf.add(addButton);

        subButton = new JButton("-");
        subButton.setBounds(360, 230, 80, 80);
        subButton.addActionListener(this);
        jf.add(subButton);

        mulButton = new JButton("*");
        mulButton.setBounds(360, 330, 80, 80);
        mulButton.addActionListener(this);
        jf.add(mulButton);

        divButton = new JButton("/");
        divButton.setBounds(360, 430, 80, 80);
        divButton.addActionListener(this);
        jf.add(divButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(460, 430, 80, 80);
        clearButton.addActionListener(this);
        jf.add(clearButton);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorSwing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // This will set the text of the displayLabel to the text of the button that was clicked
        if(e.getSource()== sevenButton)
        {
           // String labelText=displayLabel.getText(); 
            //displayLabel.setText("7");
            //OR                 displayLabel.setText(displayLabel.getText()+"7");
            
            if(isOpertorClicked){
                displayLabel.setText("7");
                isOpertorClicked=false;

            }else{
                displayLabel.setText(displayLabel.getText()+"7");

            }
            

        }
        else if(e.getSource()== eightButton)
        {
            if(isOpertorClicked){
                displayLabel.setText("8");
                isOpertorClicked=false;

            }else{
                displayLabel.setText(displayLabel.getText()+"8");

            }
        }
        else if(e.getSource()== nineButton)
        {
            displayLabel.setText(displayLabel.getText()+"9");
        }
        else if(e.getSource()== fourButton)
        {
            displayLabel.setText(displayLabel.getText()+"4");
        }
        else if(e.getSource()== fiveButton)
        {
            displayLabel.setText(displayLabel.getText()+"5");
        }
        else if(e.getSource()== sixButton)
        {
            displayLabel.setText(displayLabel.getText()+"6");
        }
        else if(e.getSource()== oneButton)
        {
            displayLabel.setText(displayLabel.getText()+"1");
        }
        else if(e.getSource()== twoButton)
        {
            displayLabel.setText(displayLabel.getText()+"2");
        }
        else if(e.getSource()== threeButton)
        {
            displayLabel.setText(displayLabel.getText()+"3");
        }
        else if(e.getSource()== zeroButton)
        {
            displayLabel.setText(displayLabel.getText()+"0");
        }
        else if(e.getSource()== dotButton){
            displayLabel.setText(displayLabel.getText()+".");
        }
        else if(e.getSource()== equalButton){
            String newValue=displayLabel.getText();
            float oldValuef=Float.parseFloat(oldValue);
            float newValuef=Float.parseFloat(newValue);

            float result=oldValuef+newValuef;
            displayLabel.setText(result+"");
        
        }
        else if(e.getSource()== addButton){
            isOpertorClicked=true;
            oldValue=displayLabel.getText();
        }
        else if(e.getSource()== mulButton){}
        else if(e.getSource()== divButton){}
        else if(e.getSource()== dotButton){}
        else if(e.getSource()== clearButton){
            displayLabel.setText("");
        }
        
    }
}