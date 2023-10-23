package GUI.com.kuangshen.Lesson3;

import java.awt.*;

public class TextPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}
class MyPaint extends Frame{
    public void loadFrame(){//为了让画笔存活下来
        setBounds(200,200,600,400);
        setVisible(true);
    }
    //画笔
    @Override
    public void paint(Graphics g) {
        // super.paint(g);
        //画笔需要有颜色，并且可以画画
        g.setColor(Color.red);
        g.drawOval(100,100,100,100);
        g.fillOval(100,100,100,100);//实心圆

        g.setColor(Color.green);
        g.fillRect(100,150,200,200);
        //监听器
        repaint();
        //养成习惯：画笔用完将它还原到最初的颜色，重写一个paint的方法
    }
}
