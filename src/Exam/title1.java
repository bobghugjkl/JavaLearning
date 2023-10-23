package Exam;

public class title1 {
    public static void main(String[] args) {
        f();
    }
    public static void f()
    {
        int x1 = 1;
        int x2 = 1;
        System.out.print("1 1 ");
        for (int i = 2; i < 10; i++) {
            System.out.print(x1+x2+" ");
            int c =x1+x2;
            x1 = x2;
            x2=c;
        }
    }
}
