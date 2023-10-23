package WenDang.java05.homeworkT4;

public class Car {
    String pinpai;
    int price;
    String type;
    String color;

    public Car() {
    }

    public Car(String pinpai, int price, String type, String color) {
        this.pinpai = pinpai;
        this.price = price;
        this.type = type;
        this.color = color;
    }
    public void run()
    {
        System.out.println("跑起来了");
    }
    public void stop()
    {
        System.out.println("停下来了");
    }
}
