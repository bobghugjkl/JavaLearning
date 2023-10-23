package WenDang.java08.NimMingDuiXiang;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Integer[] nums = {1, 3, 10, 21, 14, 5, 27};
// sort 方法需要接收一个 Comparator 排序器对象，Comparator 是接口类型
        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                if (int1 > int2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        System.out.println(Arrays.toString(nums));
    }
}