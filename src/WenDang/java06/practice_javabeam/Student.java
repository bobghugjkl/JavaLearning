package WenDang.java06.practice_javabeam;
/*定义一个学生类：要求该类中拥有 name（姓名）、age（年龄）、gender（姓名）、address（地址）等属性，
以及提供一个 showInformation 的方法，调用该方法时将学生的所有数据进行输出。输出格式为：姓名：XXX 年
龄：XX 性别：XXX 地址：XXXX。并创建学生类的对象，完成属性的赋值，通过构造方法进行赋值。赋值完成
后调用 showInformation 的方法进行输出。*/
public class Student {
    private String name;
    private int age;
    private String gender;
    private long address;

    public Student() {
    }

    public Student(String name, int age, String gender, long address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getAddress() {
        return address;
    }

    public void setAddress(long address) {
        this.address = address;
    }
    public void showInformation(){
        System.out.println("姓名："+this.name+"年龄:"+this.age+"住址："+this.address+"性别："+this.gender);
    }

}
