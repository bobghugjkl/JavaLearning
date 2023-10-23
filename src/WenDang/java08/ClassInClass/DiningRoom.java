package WenDang.java08.ClassInClass;

public class DiningRoom {
    private String egg = "鸡蛋";
    private Cooker cooker = new Cooker();//如果后面的那个函数要用到this.的话要加上这句
    class Cooker{
        public void makeFood(){
            //使用了外部类DingingRoom中定义的私有成员egg
            System.out.println("厨师使用"+egg+"，做了一份炒鸡蛋！");
        }
    }
    /*
     * DiningRoom 类对外提供的做炒鸡蛋的功能
     * 实际该功能是由内部类 Cook 来执行的

     */
    public void fireEgg(){
        //new Cooker().makeFood();  若多次调用会开很多个空间使效率降低
        this.cooker.makeFood();
    }

}
