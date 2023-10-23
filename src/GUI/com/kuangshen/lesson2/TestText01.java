package GUI.com.kuangshen.lesson2;
//import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestText01 {
    public static void main(String[] args) {
        //只管启动
        Myframe myframe = new Myframe();
        windowclose(myframe);
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

class Myframe extends Frame{
    public Myframe(){
        TextField textField = new TextField();//单行文本
        add(textField);


        //监听这个文本框输入的文字
        MyActionListener2 myActionListener2 = new MyActionListener2();//放进去监听器
        //回车事件：按下enter就会触发这个输入框的事件
        textField.addActionListener(myActionListener2);
        //设置替换编码
        textField.setEchoChar('*');//用于密码操作，这样除了控制台全是密码，保证安全性
        pack();
        setVisible(true);
    }


}
class MyActionListener2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        e.getSource();//获得一些资源，返回了一个对象
        //得到文本
        TextField field = (TextField) e.getSource();//强转
        field.getText();//获取文本
        System.out.println(field.getText());//获得输入框的文本
        field.setText("");//设置成空，这样的话回车就可以消掉
    }
}


