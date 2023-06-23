package day_14.Case.P4.Javabean;

public class Cat extends Animal{
    // 看家
    public void catchMouse(){
        System.out.println(age+"岁"+color+"颜色的猫在抓老鼠");
    }
    public Cat() {
    }

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }
}
