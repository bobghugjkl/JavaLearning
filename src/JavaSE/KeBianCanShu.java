package JavaSE;

public class KeBianCanShu {
    /*
    只能有一个，且要写在末尾才可以
    可变参数：是JDK1.5版本之后出现的新类型
    适用前提
        当方法参数和数据类型已确定，但是参数的个数不确定，就可以使用可变参数
    使用格式：定义方法时使用：
        修饰符  返回值类型  方法名（数据类型...变量名）{}
    可变参数原理：
        底层就是一个数组，传递参数个数不同，会创建长度不同的数组来存储这些参数
        传递的参数可以是0,1,2,3...
     打印的是一个数组地址（如果什么都不加）
     add（）会创建一个长度为0的数组，new int[0]
     add(10)会创建一个长度为1的数组，存储传递来过的参数new int[]{10};
     */
    public static void main(String[] args) {
        add(10+29+2131+219);
        add(23+21);
    }
    public static int add(int ...arr){
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println("==================");
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    //终极写法
    public static void method(Object...b){
        //可以接受任意的参数
    }

}
