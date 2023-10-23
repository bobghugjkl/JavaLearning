package JavaSE.HandOutRedEnvelopes;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Host host = new Host("群主",100);

        member one = new member("成员A",0);
        member two = new member("成员B",0);
        member three = new member("成员C",0);

        host.show();
        one.show();
        two.show();
        three.show();

        System.out.println("=====================");
        //群主总共发20块钱，分成3个红包
        ArrayList<Integer>redList = host.send(20,3);
        one.reseve(redList);
        two.reseve(redList);
        three.reseve(redList);
        host.show();
        one.show();
        two.show();
        three.show();

    }
}
