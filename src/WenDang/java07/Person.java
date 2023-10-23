package WenDang.java07;

public class Person {
    Person(){
        this.currentCityName="青岛";
        System.out.println(this.nation+":"+this.currentCityName);
    }
    private String nation="中国";
    private String currentCityName="济南";
    {
        System.out.println(this.nation+":"+this.currentCityName);
        this.currentCityName="淄博";
        System.out.println(this.nation+":"+this.currentCityName);
    }

    public static void main(String[] args) {
        new Person();
    }



}
