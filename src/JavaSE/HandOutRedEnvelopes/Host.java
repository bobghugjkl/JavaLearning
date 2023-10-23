package JavaSE.HandOutRedEnvelopes;

import java.util.ArrayList;

public class Host extends User{
    public Host(){
        super();
    }

    public Host(String name, int money) {
        super(name, money);
    }
    //事先并不知道要发给多少人以及要发多少钱
    public ArrayList<Integer>send(int totalmoney,int count){
        //需要一个集合用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        //先看一下群主有多少钱
        int leftMoney = super.getMoney();
        if(totalmoney>leftMoney)
        {
            System.out.println("余额不足");
            return redList;//返回值必须是一个集合，且此时需要返回一个空集合
        }
        //扣钱,其实就是重新设置余额
        super.setMoney(leftMoney-totalmoney);
        //发红包，需要平均拆分成count份
        int avg=totalmoney/count;
        int mod=totalmoney%count;
        //用除法可能除不尽，我们把剩下的零头也算出来，然后将它包在最后一个红包当中
        //把红包一个一个放到集合当中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        //最后一个红包
        int last = avg+mod;
        redList.add(last);
        return redList;
    }
}
