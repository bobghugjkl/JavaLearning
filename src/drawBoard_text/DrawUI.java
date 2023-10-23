package drawBoard_text;

import javax.swing.*;
import java.awt.*;

public class DrawUI extends JFrame {
    DrawListener dl = new DrawListener();
    String[] strs={"直线","签字笔","实时直线","谢尔宾斯基地毯","递归KLine","矩形","圆","实心矩形","实心圆","等腰三角形","三角形","多边形","改进多边形","立方体",  "橡皮擦", "撤回", "保存", "打开"};
    Color[]color = {Color.red,Color.white,Color.black,Color.blue};
    //添加功能和颜色
    public void addButton(){
        for(String str:strs){
            JButton btn = new JButton(str);
            add(btn);
        }
        Dimension dim = new Dimension(30,30);
        for (Color c : color) {
            JButton jButton = new JButton();
            jButton.setBackground(c);
            jButton.setPreferredSize(dim);
            add(jButton);
        }
    }
    public void initUI(){
        this.setTitle("画图板");
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addButton();
        this.setVisible(true);
        this.addMouseListener(dl);
        this.addMouseMotionListener(dl);
        Graphics g = getGraphics();
        dl.setG(g);

    }
    public static void main(String[] args) {
        DrawUI drawUI = new DrawUI();
        drawUI.initUI();
    }
}
