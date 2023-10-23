package JavaSE.FaHongBao2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Hoster extends User{
    public Hoster() {
    }

    public Hoster(String name, double totalMoney) {
        super(name, totalMoney);
    }
    public ArrayList<Integer> send1(double Money,int number)
    {
        ArrayList<Integer> list = new ArrayList();
        if(Money>super.getTotalMoney()){
            System.out.println("余额不足");
            return list;
        }
        super.setTotalMoney(super.getTotalMoney()-Money);
        System.out.println("老板还剩："+super.getTotalMoney());
        for (int i = 0; i < number; i++) {
            list.add((int)Money/number);

        }
        Iterator<Integer>ite = list.iterator();
        while(ite.hasNext()){
            System.out.print(ite.next());
            System.out.print(" ");
        }
        System.out.println();
        super.setTotalMoney(super.getTotalMoney()+(int)Money/number+Money%number);
        return list;
    }
    public ArrayList<Double> send2(double Money,int number)
    {
        Random sc = new Random();
        ArrayList<Double> list2 = new ArrayList();
        if(Money>super.getTotalMoney())
        {
            System.out.println("余额不足");
            return list2;
        }
        super.setTotalMoney(super.getTotalMoney()-Money);
        System.out.println("老板还剩："+super.getTotalMoney());
        double sum = 0;
        while(Money-0.01>0&&list2.size()<number)
        {
            double ans = Math.round(sc.nextDouble()*(Money-0.01)*100.0)/100.0+0.01;
            Money-=ans;
            list2.add(ans);
        }
        Iterator<Double>ite2 = list2.iterator();
        while(ite2.hasNext()){
            System.out.print(ite2.next());
            System.out.print(" ");
        }
        System.out.println();
        super.setTotalMoney(super.getTotalMoney()+Money-sum);
        return list2;
    }
}
