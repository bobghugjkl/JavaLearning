package DuoXianCheng.Thread;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class yxcDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?>cls = Class.forName("DuoXianCheng.Thread.Calculator");//把类加载进来，用包名
        Object o = cls.newInstance();//要调用无参构造函数

        Method method = cls.getMethod("add",int.class,int.class);//找里面的方法
        System.out.println(method.invoke(o,11,22));//invoke执行函数



        Field field = cls.getField("name");//动态改其他的东西

        field.set(o,"西野七濑");
        System.out.println(field.get(o));//获取用get

        Constructor<?> constructor = cls.getConstructor(String.class);//获取构造方法(这里是找第二个）
        Object newobject = constructor.newInstance("生田绘梨花");//创建新的实例
        System.out.println(newobject);



    }
}



