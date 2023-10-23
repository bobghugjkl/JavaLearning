package JavaSE.LapTop;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();
        //准备一个鼠标供电脑使用
        //Mouse mouse = new Mouse();
        //首先进行向上转型，将它当作usb
        USB usbMouse = new Mouse();
        //参数是USB类型，传进去的刚好是USB鼠标
        computer.useDevice(usbMouse);
        //创建一个usb键盘
        KeyBoard keyBoard = new KeyBoard();//没有进行多态写法
        //方法参数是USB类型，传递进去的是实现类,会自动转型
        computer.useDevice(keyBoard);
        computer.useDevice(new KeyBoard());//也是正确的
        computer.powerOff();
    }
}
