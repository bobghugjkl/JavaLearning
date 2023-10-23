package JavaSE.StudentSystem.Answer;

public class Student {
    private String name;
    private int age;
    private int studentNumber;

    public Student(String name, int age, int studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
}
