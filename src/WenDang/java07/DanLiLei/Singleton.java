package WenDang.java07.DanLiLei;

public class Singleton {
    private Singleton(){

    }
//    private static Singleton single = null;
//    public static Singleton getInstance(){
//        if(single == null){
//            single=new Singleton();
//        }
//        return single;
//    }
    private static Singleton single = new Singleton();
    public static Singleton getInstance(){
        return single;
    }
}
