package day_14.Case.P4.Javabean;

public class Animal {
    private int age;
    private String color;

    // 吃东西
    public void eat(String something) {
        System.out.println(age + "岁的" + color + "颜色的狗在吃" + something);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
