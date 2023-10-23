package WenDang.java09.ShuRUWenDang;

import java.io.File;
import java.util.Scanner;

public class Text {
    public static void main(String[] args)throws Exception {
        Scanner sn = new Scanner(new File("E:\\服务外包\\WatchVideo\\src\\WenDang.java09\\ShuRUWenDang\\褐色鸟群"));
        while(sn.hasNextLine()){
            System.out.println(sn.nextLine());
        }
        sn.close();
    }
}
