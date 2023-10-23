package WenDang.java06;

public class People {
    private String name;
    private String telephone;
    private Integer age;

    public People() {
    }

    public People(String name, String telephone, Integer age) {
        this.name = name;
        this.telephone = telephone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
