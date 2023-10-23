package JavaSE.FaHongBao2;

public class User {
    private String name ;
    private double totalMoney;

    public User() {
    }

    public User(String name, double totalMoney) {
        this.name = name;
        this.totalMoney = totalMoney;
    }
    public void show(){
        System.out.println("我叫什么名字："+name+"我还剩多少钱："+totalMoney);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
