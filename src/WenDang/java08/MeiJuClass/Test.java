package WenDang.java08.MeiJuClass;

public class Test {
    public static void main(String[] args) {
        for(Day day: Day.values()){
            System.out.println(day.name());
            System.out.println("name:"+day.name()+",desc:"+day.getDesc());
        }

    }
}
