package day_14.Case.P4.Javabean;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    // 吃东西
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫在吃" + something);
    }

    // 看家
    public void catchMouse() {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫在抓老鼠");
    }
}
