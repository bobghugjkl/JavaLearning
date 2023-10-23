package WenDang.java07;

public class Person2 {
    private String nation = "中国";
    private String currentCityName="济南";
    Person2(){
        this.currentCityName="青岛";
        System.out.println(this.nation+":"+this.currentCityName);
    }
    //实例初始化块
    {
        System.out.println(this.nation+":"+this.currentCityName);
    }
    private static String flag = "success";
    static {
        System.out.println(Person2.flag);
        Person2.flag="false";
        System.out.println(Person2.flag);
    }

    public static void main(String[] args) {
        Person2 person = null;
    }
}
