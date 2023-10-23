package JavaSE.FaHongBao2;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Hoster host = new Hoster("大佬",1120);
        Member member1 = new Member("菜鸟",20);
        Member member2 = new Member("小鸟",29);
        Member member3 = new Member("大鸟",35);
        host.show();
        member1.show();
        member2.show();
        member3.show();
        ArrayList<Integer>redlist =host.send1(110,3);
        member1.recives1(redlist);
        member2.recives1(redlist);
        member3.recives1(redlist);
        host.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("============");
        ArrayList<Double>redlist2=host.send2(123,3);

        member1.recives2(redlist2);
        member2.recives2(redlist2);
        member3.recives2(redlist2);
        host.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
