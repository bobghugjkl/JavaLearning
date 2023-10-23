package drawBoard_text;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawPanel extends JPanel implements MouseListener, MouseMotionListener {
    private int x1, y1, x2, y2;
    private Graphics2D g2d;
    private boolean isDrawing = false;

    public DrawPanel() {
        setBackground(Color.WHITE);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (g2d == null) {
            g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(5));
            g2d.setColor(Color.BLACK);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
    }

    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
        isDrawing = true;
    }

    public void mouseDragged(MouseEvent e) {
        if (isDrawing) {
            x2 = e.getX();
            y2 = e.getY();
            g2d.drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;
        }
    }

    public void mouseReleased(MouseEvent e) {
        isDrawing = false;
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
}

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(new DrawPanel());
        frame.setVisible(true);
    }
}

