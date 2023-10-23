package GUI.com.kuangshen.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {
    public static void main(String[] args) {
        //按下按钮，触发事件
        Frame frame = new Frame();


        Button button = new Button();
        MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);//打开源码后发现需要一个接口服务，所以我们创建一个接口
        //文本框
        frame.add(button,BorderLayout.CENTER);
        frame.pack();
        windowclose(frame);//关闭窗口
        frame.setVisible(true);


    }
    //把关闭抽取成一个方法
    private static void windowclose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
//事件监听
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaa");
    }
}