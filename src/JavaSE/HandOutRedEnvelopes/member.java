package JavaSE.HandOutRedEnvelopes;

import java.util.ArrayList;
import java.util.Random;

public class member extends User{
    public member() {
    }

    public member(String name, int money) {
        super(name, money);
    }
    public void reseve(ArrayList<Integer>list){
        //从多个红包当中随便抽取一个
        //随机获取一个集合当中的索引编号,但是编号不可能超过集合的边界
        int index = new Random().nextInt(list.size());
        //根据索引，从集合当中删除，并且得到被删除的红包给我自己

        //我们用remove来删除集合当中的元素，但是我们在传入一个索引值之外还要注意到它其实有一个返回值Integer，remove一个索引值index其实返回的是一个
        //被删除的元素,我们记为delta
        int delta =list.remove(index);
        //当前成员本来有多少钱
        int money = super.getMoney();
        //加法，并且重新设置回去
        super.setMoney(money+delta);
    }
}
