package WenDang.java05;

public class use {
    public static void main(String[] args) {
        Apple app = new Apple();
        app.color="红彤彤";
        app.weight=5.5;
        System.out.println(app.color);
        System.out.println(app.weight);
        app.provideEnergy();
        Person person = new Person("张三");
        changeName(person);
        System.out.println("这个人的名字是"+person.name);

    }
    public static void changeName(Person per)
    {
        per.name="李四";
        System.out.println("这个人的名字是"+per.name);
    }
}
