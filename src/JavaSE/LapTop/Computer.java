package JavaSE.LapTop;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }
    //使用usb设备的方法,使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();//打开设备
        //使用特有方法，向下转型，区分对待,先判断
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        else if(usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.type();
        }

        usb.close();//关闭设备
    }

}
