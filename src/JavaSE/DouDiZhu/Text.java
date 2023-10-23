package JavaSE.DouDiZhu;

import java.util.*;

public class Text {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("♣");
        list1.add("♥");
        list1.add("♠");
        list1.add("♦");
        ArrayList<String>list2 = new ArrayList<>();
//        list2.add("A");
//        list2.add("2");
//        list2.add("3");
//        list2.add("4");
//        list2.add("5");
//        list2.add("6");
//        list2.add("7");
//        list2.add("8");
//        list2.add("9");
//        list2.add("10");
//        list2.add("J");
//        list2.add("Q");
//        list2.add("K");
        Collections.addAll(list2,"3","4","5","6","7","8","9","10","J","Q","K","A","2");
        /*这里用数组直接赋值就可以，没有必要搞个ArrayList
        可以用增强for循环来组装
        for(String number:list1){
            for(String color:list2){

            }
        }
         */
        Map<Integer,String> map = new HashMap<>();
//        for (int i = 0; i < list1.size(); i++) {
//            for (int j = 0; j < list2.size(); j++) {
//
//            }
//        }
        int k=0;
        for (String s : list2) {
            for (String s1 : list1) {
                map.put(k,s+s1);
                k++;
            }
        }


        map.put(k+1,"小王");
        map.put(k+2,"大王");
        System.out.println(map);
        List<Integer>list = new ArrayList<>();
        list.addAll(map.keySet());
        System.out.println(list);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        //集合工具类
        Collections.shuffle(list);
        for (int i = 0; i < 51; i++) {
            if(i%3==0){
                arrayList1.add(list.get(i));
            }
            else if(i%3==1){
                arrayList2.add(list.get(i));
            }
            else {
                arrayList3.add(list.get(i));
            }
        }

        for (int i = 51; i <list.size() ; i++) {
            arrayList4.add(list.get(i));
        }
//        JavaSE.Iterator iterator1 = arrayList1.iterator();
//        JavaSE.Iterator iterator2 = arrayList2.iterator();
//        JavaSE.Iterator iterator3 = arrayList3.iterator();
//        JavaSE.Iterator iterator4 = arrayList4.iterator();
//        while(iterator1.hasNext()){
//            System.out.print(iterator1.next()+" ");
//        }
//        System.out.println();
//        while(iterator2.hasNext()){
//            System.out.print(iterator2.next()+" ");
//        }
//        System.out.println();
//        while(iterator3.hasNext()){
//            System.out.print(iterator3.next()+" ");
//        }
//        System.out.println();
//        while(iterator4.hasNext()){
//            System.out.print(iterator4.next()+" ");
//        }
        //也可以直接便利
        Collections.sort(arrayList1);
        Collections.sort(arrayList2);
        Collections.sort(arrayList3);
        Collections.sort(arrayList4);

        System.out.print("刘德华：");
        for (Integer s : arrayList1) {
            System.out.print(map.get(s)+" ");
        }
        System.out.println();
        System.out.print("周星驰：");
        for (Integer s : arrayList2) {
            System.out.print(map.get(s)+" ");
        }
        System.out.println();
        System.out.print("周润发：");
        for (Integer s : arrayList3) {
            System.out.print(map.get(s)+" ");
        }
        System.out.println();
        System.out.print("底牌：");
        for (Integer s : arrayList4) {
            System.out.print(map.get(s)+" ");
        }
    }
}
