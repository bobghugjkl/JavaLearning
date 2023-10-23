package WenDang.java07.homework;
/*定义 Person 类，该类中存
name（姓名）、age（年龄）、gender（性别）
等属性，并创建 Person
类的实例对象，如果两个对象的
name、age、gender 值一样，
则认为两个对象相等，该如何实现
 */
public class Person {
    private String name;
    private Integer age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
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
    @Override
    public boolean equals(Object obj)
    {
        Person person = (Person) obj;
        if(person.getAge().equals(this.getAge())&& person.getGender().equals(this.getGender())&&person.getName().equals(this.getName())){
            return true;
        }
        return false;
    }
}
