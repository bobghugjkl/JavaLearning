package TanChiShe;

import javax.swing.*;

//游戏主启动类
public class StartGame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();


        jFrame.setBounds(10,10,900,720);
        jFrame.setResizable(false);//不可变
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //正常游戏界面放在面板上
        jFrame.add(new GamePanel());
        jFrame.setVisible(true);
    }
}
