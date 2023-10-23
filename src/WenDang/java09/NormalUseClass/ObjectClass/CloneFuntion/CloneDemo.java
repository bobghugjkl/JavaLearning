package WenDang.java09.NormalUseClass.ObjectClass.CloneFuntion;

public class CloneDemo {
    public static void main(String[] args)throws CloneNotSupportedException {
        Student st = new Student();
        st.setName("张三");
        Major major = new Major();
        major.setName("java");
        st.setMagor(major);
        Student clone = (Student) st.clone();


        System.out.println(st);
        System.out.println(st.getMagor());
        System.out.println(clone);
        System.out.println(clone.getMagor());

        st.getMagor().setName("go");

        System.out.println(st.getMagor().getName());
        System.out.println(clone.getMagor().getName());
    }
}
