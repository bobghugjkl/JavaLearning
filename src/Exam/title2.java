package Exam;

public class title2 {
    public static void main(String[] args) {
        int j=1;
        for (int i = 4; i >= 1; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print(j+" ");
            }
            System.out.println();
            j++;
        }
    }
}
