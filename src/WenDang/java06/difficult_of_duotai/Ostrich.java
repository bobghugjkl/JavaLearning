package WenDang.java06.difficult_of_duotai;

public class Ostrich extends Bird{
    @Override
    public void fly(){
        System.out.println(this.name+"在水中自由自在的游。。。");

    }

    public static void main(String[] args) {
//        Ostrich os = new Ostrich();
//        os.name="鸵鸟";
//        os.fly();
        new Ostrich().fly();
    }
}
