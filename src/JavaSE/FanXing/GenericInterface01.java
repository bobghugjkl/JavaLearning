package JavaSE.FanXing;
/*
含有泛型的接口的使用方式1：定义接口的实现类让它实现接口，并指定接口的泛型
public interface JavaSE.Iterator<E>{
    E.next();
}
在这里类比Scanner类实现了Iterator接口，并指定接口的泛型为String，所以重写的next方法泛型默认就是String
public final class Scanner implements JavaSE.Iterator<String>{
    public String next(){}
}
 */
public class GenericInterface01 implements  GenericInterface<String>{
    //重写方法别忘了
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
