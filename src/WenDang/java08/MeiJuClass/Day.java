package WenDang.java08.MeiJuClass;

public enum Day {
    MONDAY,
    YUESDAY,
    WENDNESDAY,
    THURSDAY,
    FRTDAY,
    SATURDAY,
    SUNDAY;
    private String desc;
    private int code;

    Day() {
    }

    Day(String desc, int code) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public int getCode() {
        return code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
