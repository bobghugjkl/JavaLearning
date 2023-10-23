package DuoXianCheng.Suo;
class Student extends Thread{
    private static final Object object = new Object();//方便做,设置成static就不需要传了
    private final boolean needWait;//是否需要睡眠
    public Student(boolean needWait){
        this.needWait = needWait;

    }

    @Override
    public void run() {
        synchronized (object){
            try {
                if(needWait){
                    object.wait(1000);//卡死了，允许其他线程访问,最多等待一秒自己醒
                    System.out.println(this.getName()+"允许其他线程访问结束，被唤醒了！");
                    object.notify();//此线程被唤醒后自动唤醒其它线程
                }
                else {
                   // object.notifyAll();//不需要睡眠就唤醒所有线程
                    object.notify();//随机唤醒一个
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Demo03 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Student student = new Student(true);//表示需要睡眠
            student.setName("黑岛沙和"+i);
            student.start();
        }
        Student student = new Student(false);//唤醒线程
        student.setName("二阶堂");
        Thread.sleep(1000);
        student.start();
    }
}
