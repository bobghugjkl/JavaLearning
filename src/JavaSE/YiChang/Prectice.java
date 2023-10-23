package JavaSE.YiChang;

import java.util.Scanner;

/*
模拟注册登录
分析：
    使用数组保存已经注册后的用户名
    使用scanner获取用户
    定义一个方法，对用户输入中的注册的用户名进行判断
        遍历已经注册过用户名的数组，获取每一个用户名
        进行比较
            true：抛出异常
            false：继续遍历比较
        还没找到：可以注册
 */
public class Prectice {
    //写在成员位置要用static
    static String[]usernames={"张三","李四","王五"};
    public static void main(String[] args) throws RegisterException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要注册的用户名");
        String username=sc.next();
        check(username);
    }

    //定义一个方法进行判断用户名
    public static void check(String username) throws RegisterException {
        for (String s : usernames) {
            if(s.equals(usernames)){
                throw new RegisterException("已经被注册过了");//这里属于自定义异常，自己定义一个异常也就是如果为true就说明是个异常
                //当然也可以用try-catch，直接alt加回车
            }
        }
        System.out.println("注册成功");
    }
}
