package GUI.com.kuangshen.lesson4;

import javax.swing.*;
import java.awt.*;

//图标是一个接口，需要实现类，继承JFrame（因为是弹窗）
public class IconDemo extends JFrame implements Icon {
    private int width;
    private int height;
    public IconDemo(){
        //无参构造
    }
    public IconDemo(int width,int height){
        this.width=width;
        this.height=height;
    }
    public void init(){
        IconDemo iconDemo = new IconDemo(15, 15);
        //图标放在标签上，也可以放在按钮上
        JLabel icontest = new JLabel("icontest", iconDemo, SwingConstants.CENTER);//设置标签在正中间
        Container contentPane = getContentPane();
        contentPane.add(icontest);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new IconDemo().init();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
