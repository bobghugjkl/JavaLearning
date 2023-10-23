package WenDang.java09.NormalUseClass.ObjectClass;

public class GetclassAndHashcode {
    public static void main(String[] args)throws Exception {
        Object obj = new Object();
        System.out.println(obj.getClass());
        Object obj2 = new Integer(12);
        System.out.println(obj2.getClass());
        System.out.println("===============");
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }
}
