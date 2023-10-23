package WenDang.java09.ATM;

public class Account {
    //账户号
    private String username;
    //账户密码
    private String password;
    //账户余额
    private int money;

    public Account() {
    }

    public Account(String username, String password, int money) {
        this.username = username;
        this.password = password;
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
