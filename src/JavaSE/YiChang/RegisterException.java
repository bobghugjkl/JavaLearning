package JavaSE.YiChang;
/*
自定义异常类，java提供异常类不够
注意：
    1.一般都以Exception结尾，说明是一个异常类
    2.必须继承Exception或者RuntimeException
        继承Exception:自定义异常类就是编译器异常，就必须处理
        另外的：运行期异常，无需处理，交给虚拟机处理
 */
public class RegisterException extends Exception{
    //添加一个空参数的构造方法
    public RegisterException(){

    }
    //添加一个带异常信息的构造方法
    //查看源码发现所有的异常类都会有这个方法且内部会调用父类
    public RegisterException(String s){
        super(s);
    }
}
