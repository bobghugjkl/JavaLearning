package WenDang.java08.StaticClassInClass;

public class Factory {
    public static String noodle = "面条";
    public static String dumplings = "水饺";
    private String chicken = "鸡肉";
    public void mademFood(){
        System.out.println("厂长吃的是自己夫人做的");
    }
    public static void diningFood(String food){
        System.out.println("工人吃的是食堂做的饭！");
    }
    static class DiningRoom{
        public static void eat(){
            diningFood(Factory.noodle);
        }

    }
}
