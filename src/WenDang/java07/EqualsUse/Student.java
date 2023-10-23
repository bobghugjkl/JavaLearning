package WenDang.java07.EqualsUse;

public class Student {
    private String name;
    private String cardId;
    private int age;

    public Student(String name, String cardId, int age) {
        this.name = name;
        this.cardId = cardId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*在这个方法中，首先将传入的Object类型参数强制转换为Student类型，并将其赋值给一个名为stud的Student对象。
    然后，使用this关键字获取当前对象的cardId值，并使用stud.getCardId()获取传入对象的cardId值。
    最后，使用equals方法比较这两个值是否相等。如果相等，则返回true，否则返回false。
     */
    public boolean equals(Object obj)
    {
        Student stud = (Student)obj;
        if(stud.getCardId().equals(this.getCardId())){
            return true;
        }
        return false;
    }
}

