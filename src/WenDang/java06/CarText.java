package WenDang.java06;

public class CarText {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.run();

        car=new BmwCar();
        car.run();
        car=new BenzCar();
        car.run();
    }
}
