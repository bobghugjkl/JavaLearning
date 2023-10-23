package WenDang.java06.homework;
/*组合练习：定义一个农场类：农场的名称、地址、联系方式、农场主（农场主的信息：姓名、年龄、）
农场有哪些动物？？？一些，数组，遍历动物，调用动物的方法，information（） 什么动物、颜色、体
重，动物一种类型， sound() 多态 定义动物的父类
调用农场的 show()*/
public class horm {
    private String name;
    private String address;
    private int telephone;
    private String homer;
    private int homerage;

    public horm() {
    }

    public horm(String name, String address, int telephone, String homer, int homerage) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.homer = homer;
        this.homerage = homerage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getHomer() {
        return homer;
    }

    public void setHomer(String homer) {
        this.homer = homer;
    }

    public int getHomerage() {
        return homerage;
    }

    public void setHomerage(int homerage) {
        this.homerage = homerage;
    }
}
