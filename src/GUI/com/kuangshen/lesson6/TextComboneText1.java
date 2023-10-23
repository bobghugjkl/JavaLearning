package GUI.com.kuangshen.lesson6;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TextComboneText1 extends JFrame {
    public TextComboneText1() {
        Container contentPane = this.getContentPane();
        JComboBox JComboBox = new JComboBox();

//        JComboBox.addItem(null);
//        JComboBox.addItem("斋藤飞鸟");
//        JComboBox.addItem("西野七濑");
//        JComboBox.addItem("白石麻衣");
//
//        contentPane.add(JComboBox);

        //生成列表的内容
        Vector vector = new Vector();
        //列表中需要放入的内容
        JList jList = new JList(vector);
        vector.add("斋藤飞鸟");
        vector.add("星野南");
        vector.add("生田绘梨花");
        contentPane.add(jList);



        this.setVisible(true);
        this.setBounds(100,100,100,100);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextComboneText1();
    }
}
