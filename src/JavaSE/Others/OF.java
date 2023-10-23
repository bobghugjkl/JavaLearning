package JavaSE.Others;

import java.awt.*;

/*
对集合添加的优化（list，set，map接口）
前提：存储元素的个数已经确定时使用
注意：of方法的使用接口，不适用于接口的实现类（比如arraylist，hashset，hashmap）
    返回值是不能改变的集合，不可以再使用add和put等
    set与map不可以存储重复的元素(非法参数异常)
 */
public class OF {
    public static void main(String[] args) {
       // List.of("a","b","c","d","a","d");不知道为啥错了
    }
}
