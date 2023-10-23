package drawBoard_text;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Pen {
    public static int x1,y1,x2,y2;
    public static int state =1;
    public void draw(MouseEvent e, Graphics g)
    {
        switch (state){
            case 1:
                x1 = e.getX();
                y1 = e.getY();
                state = 2;
                break;
            case 2:
                x2 = e.getX();
                y2 = e.getY();
                g.drawLine(x2,y2,x1,y1);
                state = 2;
                break;
        }
    }
}
