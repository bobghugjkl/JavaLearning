package WenDang.java09.ATM;

import java.util.Scanner;

public class ATM {
    //存储的账户信息
    private static Account[]accounts={new Account("zhangsan","123456",10000),new Account("lisi","123456",800),new Account("admin","abc123",2000)};
    //当前登录后的账户信息
    private Account acc = null;
    //登录标识
    private boolean isLogin = false;
    //键盘录入
    private Scanner scan = new Scanner(System.in);
    //ATM机的编号
    private String code = null;

    public ATM(String code) {
        this.code = code;
    }
    public void start(){
        //输出欢迎信息
        System.out.println("欢迎使用"+this.code+"号ATM！");
        //首先进行登录操作
        this.login();
        while(this.isLogin)
        {
            System.out.println("请选择操作：1、查询余额 2、取款 3、存款 4、修改密码 5、 退出系统");

            String operate = this.scan.next();
            switch (operate) {
                case "1":
                    this.showLeft();
                    break;
                case "2":
                    this.drawMoney();
                    break;
                case "3":
                    this.addMoney();
                    break;
                case "4":
                    this.changePassword();
                    break;
                case "5":
                    System.out.println("谢谢您的使用");
                    this.isLogin = false;
                    break;
                default:
                    System.out.println("输入有误，不支持此操作");
                    break;
            }
        }
    }
    private void showLeft(){
        System.out.println("当前账户的余额是"+this.acc.getMoney());
    }
    private void drawMoney(){
        System.out.println("当前账户的余额是"+this.acc.getMoney());
        System.out.println("请输入要取的金额");
        int money = this.scan.nextInt();
        if(money>0&&money<this.acc.getMoney()){
            int leftMoney = this.acc.getMoney()-money;
            this.acc.setMoney(leftMoney);
            System.out.println("操作成功，请取走钞票！");
            System.out.println("当前账户余额为:"+this.acc.getMoney());
        }else{
            System.out.println("余额不足！");
        }
    }
    private void addMoney(){
        System.out.println("当前账户余额是："+this.acc.getMoney());
        System.out.println("请将钞票叠整齐，放入窗口，存入金额为：");
        int money = this.scan.nextInt();
        if(money>0){
            int leftMoney = this.acc.getMoney()+money;
            this.acc.setMoney(leftMoney);
            System.out.println("操作成功！存入金额："+money);
            System.out.println("当前账户余额为："+this.acc.getMoney());
        }else {
            System.out.println("操作有误！");
        }
    }
    private void changePassword(){
        System.out.println("请输入原始密码：");
        String password=this.scan.next();
        if(password.equals(this.acc.getPassword())){
            System.out.println("输入新密码：");
            String newRepeat = this.scan.next();
            System.out.println("请重新输入新密码");
            String newPass = this.scan.next();
            if(newPass.equals(newRepeat))
            {
                this.acc.setPassword(newPass);
                System.out.println("修改成功");
            }else{
                System.out.println("两次输入不一致");
            }
        }else {
            System.out.println("原始密码不正确");
        }
    }
    private void login(){
        for (int i = 0; i < 3; i++) {//只允许进行三次密码输入
            System.out.println("请输入用户名：");
            String username = scan.next();
            System.out.println("请输入密码：");
            String password = scan.next();
            for(Account acc : ATM.accounts){
                if(acc.getUsername().equals(username)&&acc.getPassword().equals(password)){
                    this.isLogin=true;//登录成功，跳出循环
                    this.acc = acc;//保存当前账户信息
                    break;
                }
            }
            //根据isLogin,判断用户是否登录成功
            if(this.isLogin){
                break;//跳出三次循环
            }else{
                if(i==2){
                    System.out.println("连续输入三次错误，账户锁定");
                }else{
                    System.out.println("用户名或密码输入有误，请重新输入");
                }
            }
        }
    }

    public static void main(String[] args) {
        new ATM("001").start();
    }
}
