package JavaSE.IO.TryCatch;

import java.io.*;

/*
try-catch处理异常
jdk7可以在try后面加一个括号来定义流对象，不用写finally
jdk9在前面定义流对象，在后面的括号中引入流对象的名称，也不用写finally
 */
public class Demo1TyrCatch {
    public static void main(String[] args) throws FileNotFoundException {
//        FileWriter fw = null;//提高fw的作用域,并要赋值

//        try{
//            fw = new FileWriter("E:\\服务外包\\WatchVideo\\src\\JavaSE\\IO\\ZiFuLiu\\c.txt");
//            for (int i = 0; i < 10; i++) {
//                fw.write("hellow"+i+"\r\n");
//            }
//            fw.flush();
//
//        }catch (IOException e){
//            System.out.println(e);
//        }finally {
//            //如果创建元素失败了，就是null，会有空指针异常，所以我们要判断，不是null在把资源释放
//            if(fw!=null) {
//                try {
//                    fw.close();//把变量拿到外面来这样可以解决作用域的问题,由于本身有异常，所以还要tyr-catch
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }


        //jdk7
//        try(FileInputStream fis = new FileInputStream("E:\\服务外包\\WatchVideo\\src\\JavaSE\\IO\\ZiFuLiu\\c.txt");
//            FileOutputStream fos = new FileOutputStream("E:\\服务外包\\WatchVideo\\src\\JavaSE\\IO\\File\\File");) {
//            int len =0;
//            while((len= fis.read())!=-1){
//                fos.write(len);
//            }
//        }catch (IOException e){
//            System.out.println(e);
//        }

        //jdk9
//        FileInputStream fis = new FileInputStream("E:\\服务外包\\WatchVideo\\src\\JavaSE\\IO\\ZiFuLiu\\c.txt");
//        FileOutputStream fos = new FileOutputStream("E:\\服务外包\\WatchVideo\\src\\JavaSE\\IO\\File\\File");
//        try(fis:fos){
//            int len =0;
//            while((len= fis.read())!=-1){
//                fos.write(len);
//            }
//        }catch(IOException e){
//            System.out.println(e);
//        }
    }
}
