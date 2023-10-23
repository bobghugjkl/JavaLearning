package GUI.com.kuangshen.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionTwo {
    public static void main(String[] args) {
        //两个按钮实现同一个监听

        Frame frame = new Frame("开始-停止");
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        //可以被显示的定义触发会返回的命令，如果不显示定义则会走默认的值，可以多个按钮只写一个监听类
        button2.setActionCommand("button2-stop");

        MyMonitor myMonitor = new MyMonitor();//new一个事件
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);
        frame.add(button1,BorderLayout.SOUTH);
        frame.add(button2,BorderLayout.NORTH);

        frame.pack();
        frame.setVisible(true);
        windowclose(frame);

    }
    public static void windowclose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //e.getActionCommand():获得按钮的信息
        System.out.println("按钮被点击了，msg: "+e.getActionCommand());
        if(e.getActionCommand().equals("start")){

        }
    }
}