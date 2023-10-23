package JavaSE.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemRun {
    private ArrayList<Student1>student1s=new ArrayList<>();
    private Student1 bcc = null;//表示没登录
    private String username = "LRS";
    private String Keyword = "123456";
    private boolean islogin = false;
    private Scanner scan = new Scanner(System.in);
    public String code = null;

    public SystemRun(String code) {
        this.code = code;
    }
    public void start(){
        System.out.println("欢迎使用系统！");
        this.login();
        while(this.islogin) {
            System.out.println("请选择以下操作：1.查询学员，2.增加学员，3.删除学员，4.退出系统");
            String str = scan.next();
            switch (str) {
                case "1":
                    this.FindStudent();
                    break;
                case "2":
                    this.AddStudent();
                    break;
                case "3":
                    this.DelectStudent();
                    break;
                case "4":
                    this.islogin = false;
                    break;
                default:
                    System.out.println("操作有误!");
            }
        }
    }
    public void AddStudent(){
        try {
            scan.nextLine();
            System.out.println("请输入想添加学员的姓名：");
            String newname = scan.nextLine();
            System.out.println("请输入她的年龄：");
            int newage = scan.nextInt();
            System.out.println("请输入她的学号：");
            int newnumber = scan.nextInt();
            Student1 newstudent = new Student1(newname, newage, newnumber);
            student1s.add(newstudent);
        }catch (Exception e){
            System.out.println("输入不合法！");

        }



    }
    public void FindStudent(){
        scan.nextLine();
        System.out.println("请输入想查找学员的名字：");
        String a = scan.nextLine();
        for(Student1 b:student1s){
            if(b.getName().equals(a)){
                System.out.println("该学员的名字是"+b.getName()+" 该学员的年龄为"+b.getAge()+" 该学员的学号为"+b.getStudaynumber());
            }
        }
    }
    public void login(){
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String user = scan.nextLine();
            System.out.println("请输入密码：");
            String key = scan.nextLine();
            if(user.equals(this.username)&&key.equals(this.Keyword)){
                this.islogin = true;
                this.bcc=bcc;//不需要反复登录了！
                break;
            }
            if(3-i<3)
                System.out.println("你还剩下"+(3-i)+"次机会"+"，请重新输入：");
            if(i==3){
                System.out.println("账户锁定");
            }
        }
    }
    public void DelectStudent(){
        scan.nextLine();//防吞空格类似getline()
        System.out.println("请输入要删除学员的学号：");
        boolean isdelect = false;
        int s = scan.nextInt();
        for(Student1 student1 : student1s){
            if(student1.getStudaynumber()==s){
                student1s.remove(student1);
                isdelect=true;
                break;
            }
            if(isdelect){
                System.out.println("删除成功");
            }
            else {
                System.out.println("未查找到你要找的那个人！");
            }
        }

    }
    public static void main(String[] args) {
        new SystemRun("001").start();
    }
}
