package JavaSE.Map;

import java.util.HashMap;
import java.util.Scanner;

/*
计算一个字符串中每个字符出现的次数
字符不可以重复，一种字符放一个位置，但数量可以重复
String中的CharArray方法可以把一个字符串变成字符数组
或
String方法length()+charAt(索引)
可以遍历字符串
通过map方法中的containskey（获取到的字符）判断获取到的字符是否存储在Map集合中
    TRUE：通过字符key获取value（统计个数）
        value++；
        把新的value存储到map中
    FALSE：字符作为key，1作为value初始值存储到map
           也可以使用map中的get方法，若返回空则不存在
 */
public class Pratice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        HashMap<Character,Integer>hashMap = new HashMap<>();
        char[]s = str.toCharArray();
        for (char c : s) {
            if(hashMap.containsKey(c)){
                Integer integer = hashMap.get(c);
                integer++;
                hashMap.put(c,integer);

            }else {
                hashMap.put(c,1);
            }
        }
        for(Character key:hashMap.keySet()){
            Integer integer = hashMap.get(key);
            System.out.println(key+"=>"+integer);

        }
    }
}
