package JavaSE.IO.File;

import java.io.File;

/*
判断功能的办法
 */
public class Demo4File {
    public static void main(String[] args) {
        show01();
    }
    private static void show01(){
        File f1 = new File("C:\\Users\\DELL\\Desktop\\test");
        System.out.println(f1.exists());//判断文件是否存在


        System.out.println(f1.isDirectory());//是不是文件夹
        System.out.println(f1.isFile());//是不是文件
        //方法是互斥的，且路径必须存在(所以最好先exists判断一下)
    }
}
