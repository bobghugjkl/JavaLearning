package JavaSE.DouDiZhu;

import java.util.ArrayList;
import java.util.Iterator;

public class BianLi extends Realise{
    public void BianLi(ArrayList list){
        Iterator iterable = (list).iterator();
        while(iterable.hasNext()){
            System.out.println(iterable.next());
        }
    }

}
