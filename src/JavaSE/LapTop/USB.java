package JavaSE.LapTop;

public interface USB {
    //不知道是打开键盘还是鼠标，所以干脆用抽象类
    public abstract void open();//打开设备
    public abstract void close();//关闭设备
}
