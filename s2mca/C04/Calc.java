import java.awt.*; 
import java.awt.event.*; 
public class Calc extends Frame implements ActionListener 
{TextField t; 
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bad,bsub,bmul,bdiv,beq,bclr,bd; 
double n1=0,n2=0,res=0; 
int op=0; 
Calc() 
{ setTitle("Calculator"); 
setSize(300,400); 
setVisible(true); 
setLayout(null); 
t = new TextField(); 
t.setBounds(30, 50, 160, 40); 
add(t); 
b1 = new Button("1");  
b2 = new Button("2");  
b3 = new Button("3");  
b4 = new Button("4");  
b5 = new Button("5");  
b6 = new Button("6");  
b7 = new Button("7");  
b8 = new Button("8");  
b9 = new Button("9");  
b0 = new Button("0");  
bad = new Button("+");  
bsub = new Button("-");  

bmul = new Button("*");  
bdiv = new Button("/");  
bd = new Button(".");  
beq = new Button("=");  
bclr = new Button("C");  
b0.addActionListener(this);  
b1.addActionListener(this);  
b2.addActionListener(this); 
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this); 
b6.addActionListener(this); 
b7.addActionListener(this);  
b8.addActionListener(this); 
b9.addActionListener(this);  
bad.addActionListener(this);  
bsub.addActionListener(this); 
bmul.addActionListener(this);  
bdiv.addActionListener(this);  
beq.addActionListener(this);  
bd.addActionListener(this); 
bclr.addActionListener(this); 
int x = 30, y = 110; 
bclr.setBounds(200, 50, 50, 40); 
b1.setBounds(x, y, 50, 40);  
b2.setBounds(x+60, y, 50, 40);  
b3.setBounds(x+120, y, 50, 40);  
bdiv.setBounds(x+180, y, 50, 40); y += 50; 
b4.setBounds(x, y, 50, 40);  
b5.setBounds(x+60, y, 50, 40);  
b6.setBounds(x+120, y, 50, 40);  
bmul.setBounds(x+180, y, 50, 40); y += 50; 
b7.setBounds(x, y, 50, 40);  
b8.setBounds(x+60, y, 50, 40);  
b9.setBounds(x+120, y, 50, 40);  
bsub.setBounds(x+180, y, 50, 40); y += 50; 
b0.setBounds(x, y, 50, 40);  
beq.setBounds(x+60, y, 50, 40);  
bad.setBounds(x+120, y, 50, 40); 
bd.setBounds(210, 260, 50, 40); 
add(b1); add(b2); add(b3); add(bdiv); 
add(b4); add(b5); add(b6); add(bmul); 
add(b7); add(b8); add(b9); add(bsub); 
add(b0); add(beq); add(bad);add(bd); 
add(bclr);} 
public void actionPerformed(ActionEvent e) 
{if(e.getSource()==b1) 
t.setText(t.getText().concat("1")); 
if(e.getSource()==b2) 
t.setText(t.getText().concat("2")); 
if(e.getSource()==b3) 
t.setText(t.getText().concat("3")); 
if(e.getSource()==b4) 
t.setText(t.getText().concat("4")); 
if(e.getSource()==b5) 
t.setText(t.getText().concat("5")); 
if(e.getSource()==b6) 
t.setText(t.getText().concat("6")); 
if(e.getSource()==b7) 
t.setText(t.getText().concat("7")); 
if(e.getSource()==b8) 
t.setText(t.getText().concat("8")); 
if(e.getSource()==b9) 
t.setText(t.getText().concat("9")); 
if(e.getSource()==b0) 
t.setText(t.getText().concat("0")); 
if(e.getSource()==bd) 
t.setText(t.getText().concat(".")); 
if(e.getSource()==bad) 
{ n1=Double.parseDouble(t.getText()); op=1; 
t.setText(""); } 
if(e.getSource()==bsub) 
{ n1=Double.parseDouble(t.getText()); op=2; 
t.setText(""); } 
if(e.getSource()==bmul) 
{ n1=Double.parseDouble(t.getText()); op=3; 
t.setText(""); } 
if(e.getSource()==bdiv) 
{ n1=Double.parseDouble(t.getText()); op=4; 
t.setText(""); } 
if(e.getSource()==beq) 
{ n2=Double.parseDouble(t.getText()); 
switch(op) 
{case 1:  res=n1+n2; break; 
case 2:  res=n1- n2; break; 
case 3:  res=n1*n2; break; 

case 4:  res=n1/n2; break; 
default:res=0; break; } 
t.setText(""+res); } 
if(e.getSource()==bclr) t.setText(""); } 
public static void main(String[] args) { Calc ob =new Calc();}}