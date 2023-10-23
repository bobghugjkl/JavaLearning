package WenDang.java08.GongChangSheJiMoShi;

import WenDang.java08.InterfaceUse.DateConnection;
import WenDang.java08.InterfaceUse.MySqlConnection;
import WenDang.java08.InterfaceUse.OracleConnection;
import WenDang.java08.InterfaceUse.SqlServerConnection;

import java.io.File;
import java.util.Scanner;
/*提供的代码由一个接口DateConnection和实现该接口的三个类MySqlConnection、SqlServerConnection和OracleConnection组成。
该接口定义了两个方法，getConnection（）和close（），这两个方法分别在三个类中实现。



ConnectionFactory类有一个静态方法getConnection（），该方法根据从名为datebase.conf的文件中读取的值返回DateConnection的实例。
该方法读取文件的第一行，并使用switch语句来确定要创建哪种类型的数据库连接。如果文件包含“mysql”，则会创建一个MySqlConnection对象。
如果它包含“oracle”，则会创建一个OracleConnection对象。如果它包含“sqlserver”，则会创建一个SqlServerConnection对象。如果文件包含任何其他值，则返回null。



Application类有一个main（）方法，该方法调用ConnectionFactory.getConnection（）来获取DateConnection对象，然后调用其getConnection（（）和close（）方法。



总的来说，这段代码演示了Factory Design Pattern，它用于创建对象，而不向客户端公开实例化逻辑。*/
public class ConnectionFactory {
    public static DateConnection getConnection(){
        DateConnection conn = null;
        try{
            Scanner scan = new Scanner(new File("./conf/datebase.conf"));
            String line = scan.nextLine();
            scan.close();
            switch (line){
                case "mysql":
                    conn = new MySqlConnection();
                    break;
                case "oracle":
                    conn = new OracleConnection();
                    break;
                case "sqlserver":
                    conn = new SqlServerConnection();
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
