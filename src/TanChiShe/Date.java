package TanChiShe;

import GUI.com.kuangshen.lesson4.ImageIconDemo;

import javax.swing.*;
import java.net.URL;

//数据中心
public class Date {
    public static URL headerURL = Date.class.getResource("SuCai\\header.png");
    public static ImageIcon header = new ImageIcon(headerURL);//画笔
    public static URL upURL = Date.class.getResource("SuCai\\up.png");
    public static URL downURL = Date.class.getResource("SuCai\\down.png");
    public static URL leftURL = Date.class.getResource("SuCai\\left.png");
    public static URL rightURL = Date.class.getResource("SuCai\\right.png");
    public static ImageIcon up = new ImageIcon(upURL);//画笔
    public static ImageIcon down = new ImageIcon(downURL);//画笔
    public static ImageIcon left = new ImageIcon(leftURL);//画笔
    public static ImageIcon right = new ImageIcon(rightURL);//画笔
    public static URL bodyURL = Date.class.getResource("SuCai\\body.png");
    public static ImageIcon body = new ImageIcon(bodyURL);//画笔
    public static URL foodURL = Date.class.getResource("SuCai\\food.png");
    public static ImageIcon food = new ImageIcon(foodURL);//画笔
}
