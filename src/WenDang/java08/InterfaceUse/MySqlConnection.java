package WenDang.java08.InterfaceUse;

public class MySqlConnection implements DateConnection{
    @Override
    public void getConnection() {
        System.out.println("获取 MySql 数据库的连接。。。");
    }
    @Override
    public void close() {
        System.out.println("关闭 MySql 数据库的连接。。。");
    }

}
