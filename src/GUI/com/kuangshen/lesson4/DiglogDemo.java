package GUI.com.kuangshen.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiglogDemo extends JFrame {

    //构造器拿
    public DiglogDemo(){
        this.setVisible(true);
        this.setSize(700,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //JFrame需要一个容器
        Container contentPane = this.getContentPane();
        //绝对布局
        contentPane.setLayout(null);
        //按钮
        JButton Button = new JButton("点击弹出一个对话窗");//创建
        Button.setBounds(30,30,200,50);

        //点击这个按钮的时候弹出一个弹窗
        //监听事件
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹窗
                new MyDialogDemo();
            }
        });
        contentPane.add(Button);
    }
    public static void main(String[] args) {
        new DiglogDemo();
    }
}
//弹窗窗口
class MyDialogDemo extends JDialog{
    //构造器

    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);

        Label label = new Label("斋藤飞鸟");
        contentPane.add(label);
        label.setBounds(10,10,10,10);
        contentPane.add(label);
    }
}