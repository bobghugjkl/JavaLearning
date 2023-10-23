package JavaSE.FanXing;
/*
定义含有泛型的接口
 */
public interface GenericInterface<I> {
    //定义抽象方法，没有返回值，在方法上用一下
    public abstract void method(I i);
}
