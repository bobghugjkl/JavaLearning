package WenDang.java08.InterfaceUse;

public class OracleConnection implements DateConnection{
    @Override
    public void getConnection() {
        System.out.println("获取 Oracle 数据库的连接。。。");
    }
    @Override
    public void close() {
        System.out.println("关闭 Oracle 数据库的连接。。。");
    }

}
