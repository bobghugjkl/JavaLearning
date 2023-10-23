package DuoXianCheng.Suo;
class People implements Runnable{
    public static int cnt = 0;
    private synchronized void work(){
        for (int i = 0; i < 100000; i++) {
            cnt++;
        }
    }
    public void run(){
        work();
    }
}
public class SuoDemo2 {
    public static void main(String[] args) throws InterruptedException {
        People worker = new People();
        Thread worker1 = new Thread(worker);
        Thread worker2 = new Thread(worker);
        worker1.start();
        worker2.start();
        worker1.join();
        worker2.join();
        System.out.println(Worker.cnt);

    }
}
