package JavaSE.LapTop;
public class KeyBoard implements USB{
//鼠标放在右边名字上点击然后ctrl+c+v即可复制

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");

    }
    //特有方法
    public void type(){
        System.out.println("键盘输入");
    }
}

