package WenDang.java09.RuntimeClassFuntion;

public class Demo {
    public static void main(String[] args)throws Exception {
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量："+rt.availableProcessors());
        System.out.println("空闲内存数："+rt.freeMemory());
        System.out.println("总内存数："+rt.totalMemory());
        System.out.println("可用最大内存数："+rt.maxMemory());
    }
}
