package WenDang.java09.NormalUseClass.ObjectClass.CloneFuntion;

public class Student implements Cloneable{
    private String name;
    private Major magor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Major getMagor() {
        return magor;
    }

    public void setMagor(Major magor) {
        this.magor = magor;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
