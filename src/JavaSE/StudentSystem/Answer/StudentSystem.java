package JavaSE.StudentSystem.Answer;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄：");
        int age = scanner.nextInt();
        System.out.println("请输入学生学号：");
        int studentNumber = scanner.nextInt();
        Student student = new Student(name, age, studentNumber);
        students.add(student);
        System.out.println("添加成功！");
    }

    public void deleteStudent() {
        System.out.println("请输入要删除学生的姓名：");
        String studentName = scanner.nextLine();
        boolean isDeleted = false;
        for (Student student : students) {
            if (student.getName() .equals(studentName)) {
                students.remove(student);
                isDeleted = true;
                break;
            }
        }
        if (isDeleted) {
            System.out.println("删除成功！");
        } else {
            System.out.println("未找到该学生！");
        }
    }

    public void queryStudent() {
        System.out.println("请输入要查询学生的姓名：");
        String studentName = scanner.nextLine();
        boolean isFound = false;
        for (Student student : students) {
            if (student.getName() .equals(studentName)) {
                System.out.println("学生姓名：" + student.getName());
                System.out.println("学生年龄：" + student.getAge());
                System.out.println("学生学号：" + student.getStudentNumber());
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("未找到该学生！");
        }
    }
    public static void main(String[] args) {
        StudentSystem system = new StudentSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请选择以下操作：1.查询学生，2.增加学生，3.删除学生，4.退出系统");
            String str = scanner.next();
            switch (str) {
                case "1":
                    system.queryStudent();
                    break;
                case "2":
                    system.addStudent();
                    break;
                case "3":
                    system.deleteStudent();
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("操作有误!");
            }
        }
    }
}
