package GUI.com.kuangshen.lesson1;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //展示多个窗口
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.blue);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.yellow);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.white);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.MAGENTA);
    }
}
class MyFrame extends Frame{
    //为了多个弹窗，然后用到了封装
    static int id =0;//可能存在多个窗口，需要一个计数器
    public MyFrame(int x,int y,int w,int h,Color color){
        super("Myframe"+(++id));

        setBounds(x,y,w,h);
        setBackground(color);
        setVisible(true);//一般放置在最下面
    }

}
