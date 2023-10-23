package GUI.com.kuangshen.Lesson3;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

public class TextMouseLinstener {
    /*
    鼠标监听事件
     */
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}








class MyFrame extends Frame{
    //画画需要画笔，需要监听鼠标当前的位置，需要集合来存储这个点
    //我们的存点在最高级存
    ArrayList points;
//添加一个点到我们的界面上面，用我们的Paint把点画上去，我们把points里面的点全部都迭代画上去
    @Override
    public void paint(Graphics g) {//但是是一次性画的，只画一次，初始的点是空的，这样画一次就没了，我们需要让它每点击一次就要重画一次，也就是说写在内存中了，我们要frame刷新
        //画画，监听鼠标的事件
        Iterator iterator = points.iterator();
        while(iterator.hasNext()){
            Point point = (Point) iterator.next();//这里我们需要强转成点，有很多地方需要强转
            g.setColor(Color.BLUE);
            g.fillOval(point.x,point.y,10,10);
        }
    }
//添加一个点到界面上,把点添加到paint那个函数里面去，通过中间商
    public void addPoint(Point point){
        //将其放在数组里面
        points.add(point);
    }

    public MyFrame(String title) {
        super(title);
        //设置属性
        setBounds(200,200,400,300);
        //画画，监听鼠标事件，添加鼠标监听器针对窗口的
        //存鼠标点击的点,因为我们之后也可能会用到，所以我们把它存到最高
        points = new ArrayList<>();



        setVisible(true);
        //鼠标监听器，正对着窗口
        this.addMouseListener(new MyMouseListener());
    }

    //写一个addMouseListener中不存在的内部类
    private class MyMouseListener extends MouseAdapter {
        //重写方法非常麻烦，我们用适配器模式解决他,及我们不用接口，而用他的一个实现类作为父类来继承
        //鼠标点击，按下，弹起，按住不放


        @Override
        public void mousePressed(MouseEvent e) {
            //我们用MyFrame来调用它的，所以它的值应该是个MyFrame，我们要拿到这个窗口
            MyFrame myFrame = (MyFrame) e.getSource();
            //这里我们点击的时候就会在界面上产生一个点，点要画出来，思路转到画笔这儿来，画笔是要和鼠标的位置上，所以我们要存点
            //看看可不可以吧paint new出来,这个点就是鼠标的点,e就是鼠标的点
            myFrame.addPoint(new Point(e.getX(),e.getY()));
            //每次点击鼠标都需要重画一遍
            myFrame.repaint();//刷新
        }
    }
}
