import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public  class Board extends JPanel {

    private static final long serialVersionUID = 1L;
    protected int width;
    protected int height;    

    public Board(int w, int h) {    
        width = w;
        height = h;
        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(width, height);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        // Draw a Black Circle
        g2.setColor(Color.green);
        g2.fillOval(50, 50, 100, 100);
        
    	// Draw a Red square
        g2.setColor(Color.green);
        g2.fillRect(350, 50,  100,  100);
        
     // Draw a Blue Square
        g2.setColor(Color.green);
        g2.fillRect(50, 350,  100,  100);
        
        //Orange thingy
        g2.setColor(Color.green);
        g2.fillRoundRect(350, 350, 100, 100, 50, 50);

    }
}
