package WenDang.java08.InterfaceUse;

public class ConnectionImpl implements DBobjectType,DateConnection{
    @Override
    public void getConnection() {
        System.out.println("获取一个链接对象！");
    }

    @Override
    public void close() {
        System.out.println("将链接进行关闭！");
    }

    public static void main(String[] args) {
        ConnectionImpl impl = new ConnectionImpl();
        //直接从DBobjectType继承过来的成员变量定义
        System.out.println("数据对象类型："+ConnectionImpl.ROOT);
        impl.getConnection();
    }
}
