package WenDang.java09.NormalUseClass.RandomClass;
/*
这段代码演示了如何使用Java中的Random类生成一个长度为7的随机整数数组，其中每个元素的值都在1到31之间且不重复。

首先，我们定义了一个私有方法exist(int[] nums, int num)，用于判断一个整数数组nums中是否存在整数num。
该方法使用for循环遍历整数数组nums中的每个元素，如果找到了整数num，则返回true，否则返回false。

接下来，我们定义了一个公共方法lotteryNum()，用于生成一个长度为7的随机整数数组。
该方法首先创建了一个Random对象random，然后创建了一个长度为7的整数数组nums和一个整数变量index，并将index初始化为0。
接着，该方法使用while循环生成随机整数num，并使用exist(int[] nums, int num)方法判断整数num是否已经存在于整数数组nums中。
如果整数num不存在于整数数组nums中，则将整数num赋值给整数数组nums的第index个元素，并将index的值加1。最后，该方法返回整数数组nums。

在main方法中，我们可以使用Test类的对象调用lotteryNum()方法来生成一个随机整数数组，并将其输出到控制台。
 */
import java.util.Random;

public class Test {
    private boolean exist(int[]nums,int num){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==num){
                return true;
            }
        }
        return false;
    }
    public int[] lotteryNum(){
        Random random = new Random();
        int[] nums = new int[7];
        int index = 0;
        while(index<nums.length){
            int num = random.nextInt(31)+1;
            boolean exist = this.exist(nums,num);
            if(exist == false){
                nums[index] = num;
                index++;
            }

        }
        return nums;
    }
}
