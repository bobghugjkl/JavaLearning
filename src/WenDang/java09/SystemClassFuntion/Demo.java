package WenDang.java09.SystemClassFuntion;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
/*
这段代码演示了如何使用Java中的System类来获取系统环境变量和系统属性，并将它们输出到控制台和一个属性文件中。

首先，我们使用Map,String> map = System.getenv()方法获取系统环境变量，并使用for循环遍历map中的每个键值对，并将它们输出到控制台。
接下来，我们使用System.getenv(String name)方法获取特定的环境变量，并将它们输出到控制台。

然后，我们使用Properties prop = System.getProperties()方法获取系统属性，并使用prop.toString()方法将它们输出到控制台。
我们还使用prop.getProperty(String key)方法获取特定的系统属性，并将它们输出到控制台。

最后，我们使用prop.store(OutputStream out, String comments)方法将系统属性存储到一个属性文件中。
在这个例子中，我们将属性文件存储在当前目录下的props.properties文件中，并在文件中添加了一个注释"System properties"。
 */
public class Demo{
    public static void main(String[] args)throws Exception {
        Map<String,String>map = System.getenv();
        for(String name:map.keySet()){
            System.out.println(name+":"+map.get(name));
        }
        System.out.println("===============");
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv("CLASSPATH"));
        System.out.println("===============");
        Properties prop = System.getProperties();
        System.out.println(prop.toString());
        System.out.println(prop.getProperty("\"sun.boot.library.path"));
        prop.store(new FileOutputStream("./props.properties"),"System properties");
        int []nums = {1,2,3,4,5};
        int []newNums = new int[5];
        System.arraycopy(nums,2,newNums,0,2);
        System.out.println(Arrays.toString(newNums));
    }
}