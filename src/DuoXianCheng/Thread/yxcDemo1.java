package DuoXianCheng.Thread;
class Point{
    public int x;
    public int y;
    //@Override会报错，因为没有被子类重写过
    public String getString(){
        return String.format("(%d,%d)",x,y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class ColorPoint extends Point{
    @SuppressWarnings({"all"})//将所有警告抑制掉
    public ColorPoint(int x,int y,String color){
        super(x,y);
        this.color=color;
    }
    private String color;
    @Deprecated//若标上这个再次调用时会有划线提醒
    public String getString(){
        return String.format("(%d,%d,%s)",super.x,super.y,color);
    }
}

public class yxcDemo1 {
    //注解：不影响程序逻辑，但会被执行（可能在编译的时候进行，比如override来看是不是重写，或者在运行时进行，加载配置之类的），也被称为元数据，标记功能是否过时，忽略警告等
    public static void main(String[] args) {

    }
}
