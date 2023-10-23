package Exam;

import java.util.HashMap;
import java.util.Map;

public class duperX {
    int i=0;
    int j=1;

    public static void main(String[] args) {
        Thread t = new Thread();

    }
    public void f(){
        while(i++<5){
            System.out.println("j="+j++);
        }
    }
}
