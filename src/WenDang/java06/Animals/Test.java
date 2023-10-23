package WenDang.java06.Animals;

public class Test {
    public static void main(String[] args) {
        Anmimal anmimal=new Cat();
        if(anmimal instanceof Cat)
        {
            Cat cat = (Cat) anmimal;
        }
        anmimal.eat();
        ((Cat)anmimal).catchMouse();
    }
}
