package drawBoard_text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class DrawListener extends DrawListenerFather{
    private Graphics g;
    String shapeName = null;
    String btn_action;
    Color color;
    int x2,y2,x3,y3;

    public void setG(Graphics g) {
        this.g = g;
    }
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        btn_action = e.getActionCommand();
        if(btn_action.equals("")){
            JButton btn = (JButton) e.getSource();
            color = btn.getBackground();
            g.setColor(color);
            return;
        }else{
            shapeName = btn_action;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x3 = e.getX();
        y3 = e.getY();
        if(shapeName == null){
            return;
        }
        switch (shapeName){
            case "直线":
                g.drawLine(x2,y2,x3,y3);
                break;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
