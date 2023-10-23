package DuoXianCheng.Suo;

import java.util.concurrent.locks.ReentrantLock;

class Worker extends Thread{
   // private static final ReentrantLock lock = new ReentrantLock();
    //public static int cnt = 0;
    public static Integer cnt = 0;

    public final static Object object = new Object();//定义静态对象

    private  void work(){//也可以把同步加在函数上,但这样不会被卡死，只是在访问同一对象上会被卡死,可以用加载接口上的写法，imp... Runable
        synchronized (this){
            for (int i = 0; i < 1000; i++) {
                cnt++;
            }
        }

    }


    public void run(){
//        for (int i = 0; i < 100000; i++) {
//            lock.lock();//操作公共资源
//            try {
//                cnt++;
//            }finally {
//                lock.unlock();//完整执行完之后释放
//            }
//            synchronized (object) {//同步写法，多个线程必须要传入一个对象
//                for (int j = 0; j < 10; j++) {
//                    cnt++;
//                }
//
//            }
        work();
        }
    }

public class SuoDemo {
    public static void main(String[] args) throws InterruptedException {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        worker1.setName("斋藤飞鸟");
        worker2.setName("西野七濑");
        worker1.start();
        worker2.start();
        worker1.join();
        worker2.join();
        System.out.println(Worker.cnt);
    }
}
