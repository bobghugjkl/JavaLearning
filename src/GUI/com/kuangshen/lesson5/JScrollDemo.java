package GUI.com.kuangshen.lesson5;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {
    public JScrollDemo() {
        Container container = this.getContentPane();
        JTextArea jTextArea = new JTextArea();
        jTextArea.setText("欢迎来到狂神学java");
        //Scroll面板
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        container.add(jScrollPane);
        this.setVisible(true);
        this.setBounds(100,100,100,100);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
