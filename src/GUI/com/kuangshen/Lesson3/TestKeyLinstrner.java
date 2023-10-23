package GUI.com.kuangshen.Lesson3;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//键盘
public class TestKeyLinstrner {
    public static void main(String[] args) {
        new KeyFrame();
    }
}
class KeyFrame extends Frame{
    public KeyFrame(){
        setBounds(1,2,300,400);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            //键盘按下
            @Override
            public void keyPressed(KeyEvent e) {
                //获得键盘按下的键
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if(keyCode==KeyEvent.VK_UP){
                    System.out.println("你按下了上键");
                }
                //根据按下的不同认出不同的键
                super.keyPressed(e);
            }
        });
    }
}