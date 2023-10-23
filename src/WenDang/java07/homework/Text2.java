package WenDang.java07.homework;

public class Text2 {
    public static void main(String[] args) {
        Person person= new Person("李润石",18,"男");
        Person person1 = new Person("李润石",18,"男");
        Person person2 = new Person("马艳朝",18,"男");
        System.out.println(person2.equals(person1));
        System.out.println(person.equals(person1));
    }
}
