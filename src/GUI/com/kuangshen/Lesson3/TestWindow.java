package GUI.com.kuangshen.Lesson3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}
class WindowFrame extends Frame {
    public WindowFrame(){
        setBackground(Color.blue);
        setBounds(100,100,200,200);

        setVisible(true);
        //addWindowListener(new MyWindowListener());//添加一个事件
        this.addWindowListener(//匿名内部类，是最好的东西
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("你点击了X");
                        System.exit(0);
                    }

                    @Override
                    public void windowActivated(WindowEvent e) {
                        WindowFrame source =(WindowFrame) e.getSource();
                        source.setTitle("被激活了");
                    }
                }
        );
    }

    //内部类
//    class MyWindowListener extends WindowAdapter{
//        @Override
//        public void windowClosing(WindowEvent e) {
//            setVisible(false);//隐藏窗口，通过按钮隐藏窗口
//            System.exit(0);//正常退出
//        }
//    }
}
