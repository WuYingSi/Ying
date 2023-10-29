package day_14.Case.P4.Javabean;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    // 吃东西
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗在吃" + something);
        // 不能直接使用变量age，因为父类对其私有化private，必须使用方法getAge()来进行调用
    }

    // 看家
    public void lookHome() {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗在看家");
    }
}
