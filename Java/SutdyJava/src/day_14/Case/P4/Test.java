package day_14.Case.P4;

import day_14.Case.P4.Javabean.Cat;
import day_14.Case.P4.Javabean.Dog;
import day_14.Case.P4.Javabean.Person;

public class Test {
    public static void main(String[] args) {
        // 创建饲养员
        Person r = new Person("小英", 21);
        // 创建猫
        Cat c = new Cat(2, "白");
        // 创建狗
        Dog d = new Dog(1, "黑");
        c.catchMouse();
        d.lookHome();
        r.keepPet(d,"牛肉");
        r.keepPet(c,"鱼肉");

    }
}
