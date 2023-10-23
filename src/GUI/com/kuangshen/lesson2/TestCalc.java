package GUI.com.kuangshen.lesson2;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//简易计算器
public class TestCalc {
    public static void main(String[] args) {
        //在方法里面要new计算器类
        Calculator calculator = new Calculator();
        calculator.loadFrame();

        windowclose(calculator);
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
//计算器类,是继承了窗口，在构造器里面搞定
class Calculator extends Frame{
    //属性：
    TextField field1,field2,field3;

    //方法:我们不要构造器了，变成一个标准的类
    public void loadFrame(){
        //三个文本框
        field1 = new TextField(10);//这表示几个数字输入，字符数
        field2 = new TextField(10);
        field3 = new TextField(10);
        //一个标签
        Label label = new Label("+");
        //一个按钮
        Button button = new Button("=");



        //要加一个监听事件，即绑定一个事件
        //button.addActionListener(new MyCalculatorListener(field1,field2,field3));
        button.addActionListener(new MyCalculatorListener());//把自己丢给它的话我们一般要提升作用域，把这种属性方法提到外面去




        //布局就是流式布局
        setLayout(new FlowLayout());
        add(field1);
        add(label);
        add(field2);
        add(button);
        add(field3);
        pack();
        setVisible(true);
    }
    private class MyCalculatorListener implements ActionListener{


            @Override
            public void actionPerformed(ActionEvent e) {
                //1.获得加数和被加数
                //String text1 = calculator.field1.getText();
                int n1 = Integer.parseInt(field1.getText());
                int n2 = Integer.parseInt(field2.getText());

                //2.等于的时候将这个值+法运算后放在第三个框
                field3.setText(""+(n1+n2));
                //3.清除前两个框
                field1.setText("");
                field2.setText("");
            }

    }
}

//监听器类,太麻烦了，可以直接作为内部类导入,内部类想获得直接拿
//class MyCalculatorListener implements ActionListener{
//
//    Calculator calculator = null;
//    public MyCalculatorListener(Calculator calculator) {
//        this.calculator = calculator;
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        //1.获得加数和被加数
//        //String text1 = calculator.field1.getText();
//        int n1 = Integer.parseInt(calculator.field1.getText());
//        int n2 = Integer.parseInt(calculator.field2.getText());
//
//        //2.等于的时候将这个值+法运算后放在第三个框
//        calculator.field3.setText(""+(n1+n2));
//        //3.清除前两个框
//        calculator.field1.setText("");
//        calculator.field2.setText("");
//    }
//
//}
