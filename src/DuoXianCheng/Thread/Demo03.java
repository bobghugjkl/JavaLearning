package DuoXianCheng.Thread;

public class Demo03 {
    public static void main(String[] args) throws InterruptedException {
        Worker worker1 = new Worker();
        worker1.setName("斋藤飞鸟");
        Worker worker2 = new Worker();
        worker2.setName("西野七濑");
        worker1.start();
        worker2.start();//注意现在开了三个线程了

        worker1.join(5000);//主线程执行到这句话会卡主，直到执行完毕worker1才会继续执行,括号中加时间是最多等他多少秒
        worker1.interrupt();//抛异常，可以进入异常,第二个线程没有效果,休眠中断线程1，只能中断一部分，不可以中断所有线程，得有这个睡眠的才可以控制
        Thread.sleep(1000);
        System.out.println("生田绘梨花");
        //守护线程，当其他有用的线程都结束之后会将线程自动结束掉,现在这种即当worker2和主线程都结束时，不管worker执行到哪了都会结束
        worker1.setDaemon(true);
    }
}
class Worker extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello"+this.getName()+" -"+i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}