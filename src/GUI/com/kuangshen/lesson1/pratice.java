package GUI.com.kuangshen.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/*
总结：
Frame是一个顶级窗口
panel无法单独显示，必须添加到某个容器中
布局管理器
大小，定位，背景颜色，可见性
 */
public class pratice {
    /*
    1.我们需要一个最大的frame窗
    2.我们需要四个面板 border
            左：button
            右：button
            中间：面板
     */
    public static void main(String[] args) {
        //总的frame
        Frame frame = new Frame();
        frame.setSize(400,300);
        frame.setLocation(300,400);
        frame.setBackground(new Color(254,2,41));
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));//这里是表格布局，比如两行一列



        //四个面板,我们需要东西南北中的布局
        Panel panel1 = new Panel(new BorderLayout());
        //上下结构嵌入到窗口里面
        Panel panel2 = new Panel(new GridLayout(2,1));

        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));

        panel1.add(new Button("East-1"),BorderLayout.EAST);
        panel1.add(new Button("West-1"),BorderLayout.WEST);

        panel2.add(new Button("South-1"));
        panel2.add(new Button("North-1"));
        panel1.add(panel2,BorderLayout.CENTER);

        panel3.add(new Button("East-2"),BorderLayout.EAST);
        panel3.add(new Button("West-2"),BorderLayout.WEST);

        for (int i = 1; i <= 4; i++) {
            panel4.add(new Button("for-"+i));
        }
        panel3.add(panel4,BorderLayout.CENTER);
        frame.add(panel1);
        frame.add(panel3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
