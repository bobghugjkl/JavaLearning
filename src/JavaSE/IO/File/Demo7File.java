package JavaSE.IO.File;

import java.io.File;

/*
递归遍历多级文件

 */
/*
文件搜索
只要java.文件
 */

public class Demo7File {
    public static void main(String[] args) {
        File file = new File("\"C:\\Users\\DELL\\Desktop\\文本文档.txt\"");
        getAllFile(file);
    }
    public static void getAllFile(File dir){
        System.out.println(dir);//打印目录
        File[]file =dir.listFiles();
        for (File file1 : file) {
            if(file1.isDirectory()){
                getAllFile(file1);
            }else {
//                //搜索文件，只要java.的文件,先转换为字符串，这里只显示一种方法，用getname和getpath都可以
//                String s1 = file1.toString();
//                s1=s1.toLowerCase();//全部转化为小写，文件不分大小，但字符串分
//                //调用string方法
//                boolean b = s1.endsWith(".java");
//                if(b) {
//                    System.out.println(file1);
//                }
                //接下来是链式列表，也可以做
                if(file1.getName().toLowerCase().endsWith(",java")){
                    System.out.println(file1);
                }
            }
        }
        /*
        发现遍历的结果并不完全，没有子文件夹中的内容，我们可以对得到的file对象进行判断，判断是否是文件夹，如果是的话就再遍历
         */
    }
}
