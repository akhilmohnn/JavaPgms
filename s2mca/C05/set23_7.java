import java.awt.*; 
import java.awt.event.*;
public class set23_7 extends Frame implements WindowListener { set23_7()
{setTitle("Mouse & Window Events"); setSize(400, 300);
setVisible(true);

    addWindowListener(this);
}
public void windowOpened(WindowEvent e) { System.out.println("Window Opened");
}
public void windowClosing(WindowEvent e) { System.out.println("Window Closing");
}
public void windowClosed(WindowEvent e) { System.out.println("Window Closed");
}
public void windowIconified(WindowEvent e) { System.out.println("Window Minimized");
}
public void windowDeiconified(WindowEvent e) { System.out.println("Window Restored");
}
public void windowActivated(WindowEvent e) { System.out.println("Window Activated");
}
public void windowDeactivated(WindowEvent e) { System.out.println("Window Deactivated");
}
public static void main(String[] args) { set23_7 ob= new set23_7();
}}
