package GUI.com.kuangshen.lesson1;

import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args) {
        Frame testBorderLayout = new Frame("TestBorderLayout");
        Button east = new Button("East");
        Button west = new Button("West");
        Button south = new Button("South");
        Button north = new Button("North");
        Button center = new Button("Center");

        testBorderLayout.add(east,BorderLayout.EAST);//按钮添加到合适的位置
        testBorderLayout.add(west,BorderLayout.WEST);
        testBorderLayout.add(south,BorderLayout.SOUTH);
        testBorderLayout.add(north,BorderLayout.NORTH);
        testBorderLayout.add(center,BorderLayout.CENTER);

        testBorderLayout.setSize(200,200);
        testBorderLayout.setVisible(true);
        //不同模式之间可以嵌套
    }
}
