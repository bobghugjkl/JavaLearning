package DuoXianCheng.Thread;
class Worker1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello"+"thread1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Worker2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello"+"thread1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class RunableDemo1 {
    public static void main(String[] args) {
        new Thread(new Worker1()).start();
        new Thread(new Worker2()).start();

        Worker1 worker1 = new Worker1();
//        new Thread(worker1).start();
//        new Thread(worker1).start();//这样可以一个类多线程，这种比较容易写同步，天然是一个类
        Worker2 worker2 = new Worker2();


    }
}
