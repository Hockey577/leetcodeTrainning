package schoolTest;

public enum Enum1 {

    RED(0,"红色"),

    BLUE(1,"蓝色");

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 状态码
     */
    private Integer value;

    /**
     * 状态描述
     */
    private String desc;

    Enum1(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Enum1{" +
                "value=" + value +
                ", desc='" + desc + '\'' +
                '}';
    }
}
