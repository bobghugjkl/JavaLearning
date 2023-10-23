package WenDang.java08.InterfaceUse;

public class SqlServerConnection implements DateConnection{
    @Override
    public void getConnection() {
        System.out.println("获取 SqlServer 数据库的连接。。。");
    }
    @Override
    public void close() {
        System.out.println("关闭 SqlServer 数据库的连接。。。");
    }
}
