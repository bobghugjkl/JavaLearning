package JavaSE.IO.File;

import java.io.File;
import java.io.FileFilter;

/*
创建过滤器的实现类，重写过滤方法，定义过滤规则
1.accept是谁调用的
2.accept参数是什么
 */
public class FileFilterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java");
    }
}
