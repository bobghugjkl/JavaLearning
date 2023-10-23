package GUI.com.kuangshen.lesson5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo2 extends JFrame {
    public JButtonDemo2() {
        Container contentPane = this.getContentPane();
        //将第一个图片变成图标
        URL resource = JButtonDemo1.class.getResource("QQ图片20230226204126.jpg");
        Icon icon = new ImageIcon(resource);

//        //单选框
//        JRadioButton jRadioButton1 = new JRadioButton("jRadioButton1");
//        JRadioButton jRadioButton2 = new JRadioButton("jRadioButton2");
//        JRadioButton jRadioButton3 = new JRadioButton("jRadioButton3");
//        //单选框只能选择一个，所以分组
//        ButtonGroup group = new ButtonGroup();
//        group.add(jRadioButton1);
//        group.add(jRadioButton2);
//        group.add(jRadioButton3);
//
//        contentPane.add(jRadioButton1,BorderLayout.CENTER);
//        contentPane.add(jRadioButton2,BorderLayout.NORTH);
//        contentPane.add(jRadioButton3,BorderLayout.SOUTH);
        //多选框
        JCheckBox jCheckBox1 = new JCheckBox("斋藤飞鸟");
        JCheckBox jCheckBox2 = new JCheckBox("西野七濑");

        contentPane.add(jCheckBox1,BorderLayout.SOUTH);
        contentPane.add(jCheckBox2,BorderLayout.CENTER);



        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonDemo2();
    }
}
