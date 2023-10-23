package WenDang.java05;

public class Apple {
    Long id;
    String color;
    Double weight;
    String origin;

    public Apple() {
    }

    public Apple(Long id, String color,Double weight,String origin){
        this.id=id;
        this.color=color;
        this.weight=weight;
        this.origin=origin;
    }
    public void provideEnergy(){
        System.out.println("吃了苹果美滋滋");
    }
}
