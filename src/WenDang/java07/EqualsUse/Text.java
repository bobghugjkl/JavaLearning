package WenDang.java07.EqualsUse;

public class Text {
    public static void main(String[] args) {
        Student stud1 = new Student("王小明","370101200001123241", 30);
        Student stud2 = new Student("王大明", "370101200001123241", 30);
        System.out.println(stud1.equals(stud2));
    }
}
