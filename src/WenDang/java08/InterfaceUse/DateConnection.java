package WenDang.java08.InterfaceUse;

public interface DateConnection {
    /*
    定义获取数据库连接的方法
     */
    public abstract void getConnection();
    /*
    定义关闭数据库连接的方法，在接口中是否使用public abstruct 意义相同
     */
    void close();
}
