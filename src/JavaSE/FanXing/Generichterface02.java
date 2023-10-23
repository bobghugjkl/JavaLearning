package JavaSE.FanXing;

public class Generichterface02<I> implements GenericInterface<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
    /*
    第二种实现方式，接口使用什么泛型，实现类就使用什么泛型，类跟着接口走
    相当于定义了一个含有泛型的类，比如ArrayList集合
    public interface JavaSE.List<E>{
        boolean add(E e);
        E get(int index);
    }

     */

}
