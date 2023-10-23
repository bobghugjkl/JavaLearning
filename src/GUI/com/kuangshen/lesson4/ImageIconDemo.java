package GUI.com.kuangshen.lesson4;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    public ImageIconDemo() {
        JLabel imageIcon = new JLabel("ImageIcon");
        //获取图片的地址
        URL url = ImageIconDemo.class.getResource("QQ图片20230228190532.jpg");//通过这个类获取当前类路径下的东西,url是具体地址
        ImageIcon imageIcon1 = new ImageIcon(url);
        imageIcon.setIcon(imageIcon1);
        imageIcon.setHorizontalAlignment(SwingConstants.CENTER);//居中显示
        Container contentPane = getContentPane();
        contentPane.add(imageIcon);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,200,200);
    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
