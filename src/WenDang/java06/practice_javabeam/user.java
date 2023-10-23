package WenDang.java06.practice_javabeam;

public class user {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("小明");
        student.setAge(12);
        student.setGender("男");
        student.setAddress(123);
        student.showInformation();
    }
}
