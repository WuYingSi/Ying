package day_15.Case.P2;

import day_15.Case.P2.Javabean.Dog;
import day_15.Case.P2.Javabean.Frog;
import day_15.Case.P2.Javabean.Rabbit;

public class test {
    public static void main(String[] args) {
        // 创建青蛙对象
        Frog f=new Frog("wa",1);
        f.eat();
        f.swim();
        // 创建狗对象
        Dog d=new Dog("gou",1);
        d.swim();
        d.eat();
        // 创建兔子对象
        Rabbit r=new Rabbit("tu",2);
        r.eat();
        // r.swim(); 报错
    }
}
