package JavaSE.LapTop;
//鼠标就是一种usb设备
public class Mouse implements USB{
//鼠标放在函数名上然后alt+回车

    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");

    }
    //特有方法
    public void click(){
        System.out.println("鼠标点击");
    }
}

