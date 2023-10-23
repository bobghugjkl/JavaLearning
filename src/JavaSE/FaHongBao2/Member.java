package JavaSE.FaHongBao2;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, double totalMoney) {
        super(name, totalMoney);
    }
    public void recives1(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
        int delax =  list.remove(index);
        super.setTotalMoney(super.getTotalMoney()+delax);
    }
    public void recives2(ArrayList<Double>list){
        int index = new Random().nextInt(list.size());
        double delax = list.remove(index);
        super.setTotalMoney(super.getTotalMoney()+delax);
    }
}
