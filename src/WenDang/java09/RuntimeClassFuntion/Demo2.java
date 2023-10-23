package WenDang.java09.RuntimeClassFuntion;
//Runtime类调用bat处理文件执行
public class Demo2 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try{
            //找到文件的位置，并执行批处理文件，返回process进程对象
            Process process = runtime.exec("./conf/run.bat");
            //waitFor方法是等待进程执行结束，并返回状态值
            int status = process.waitFor();
            System.out.println(status);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
