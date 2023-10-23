package JavaSE.DouDiZhu;

import JavaSE.FanXing.GenericInterface;

import java.util.ArrayList;

public class Realise<I> implements GenericInterface<I> {
    ArrayList<I> arrayList1 = new ArrayList<>();
    ArrayList<I> arrayList2 = new ArrayList<>();
    ArrayList<I> arrayList3 = new ArrayList<>();

    @Override
    public void method(I i) {

    }
}
