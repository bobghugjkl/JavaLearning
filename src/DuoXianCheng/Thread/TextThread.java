package DuoXianCheng.Thread;
//创建线程方式一:继承thread类，重写run方法，调用start开启线程
//start方法是开启了一个线程，然后线程会调用run方法，如果直接调用run方法，那和定义了一个对象，然后调用对象中的一个方法没有区别，根本没有创造新的线程
public class TextThread extends Thread{
    public void run(){
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("哈哈哈");
        }
    }

    public static void main(String[] args) {
        //创建一个线程对象,调用start方法开启线程
        TextThread textThread = new TextThread();
        textThread.start();
        //main线程，主线程
        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程"+i);
        }
        //但是这样的话还是“我在学习多线程”在前面，而“哈哈哈”则是在这里面交替出现，因为执行速度非常快所以执行次数过少看不出来，总之是同时进行的
        //线程不一定执行，因为cpu调度执行，cpu是单核的一次只能看一个，所以是交替出现
    }
}
