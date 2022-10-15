import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

public class MyFrame extends JFrame implements MouseInputListener{
    JLabel label;
    
    MyFrame() {
        this.setTitle("Autoclicker");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(38,38,38)); //109,203,222 = light blue
        this.setResizable(false);
        this.setAlwaysOnTop (true);

        ImageIcon image = new ImageIcon("shinobu.png");
        this.setIconImage(image.getImage());

        label = new JLabel();
        label.setText("Click to exit");
        
        // label.setLocation(85, 80);
        label.setLocation(82, 75);
        label.setSize(120, 120);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(new Color(219, 9, 9)); //222, 109, 118 = light red/pink
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true); 
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked if mouse button clicked (pressed and released) on a component
        System.out.println("ExitClick");
        System.exit(0);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked if mouse button has been pressed on a component
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Invoked when a mouse button is pressed on a component and then dragged
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Invoked when the mouse cursor has been moved onto a component but no buttons have been pushed.

    }

}
