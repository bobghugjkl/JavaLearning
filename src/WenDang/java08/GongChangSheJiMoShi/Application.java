package WenDang.java08.GongChangSheJiMoShi;

import WenDang.java08.InterfaceUse.DateConnection;

public class Application {
    public static void main(String[] args) {
        DateConnection conn = ConnectionFactory.getConnection();
        conn.getConnection();
        conn.close();
    }
}
