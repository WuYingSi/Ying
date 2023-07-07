package day_15.Case.P1;

import day_15.Case.P1.Javabean.Dog;
import day_15.Case.P1.Javabean.Frog;
import day_15.Case.P1.Javabean.Sheep;

public class Test {
    public static void main(String[] args) {
        // 创建青蛙
        Frog f= new Frog("蛙",5);
        // 创建狗
        Dog d= new Dog("狗",1);
        // 创建山羊
        Sheep s=new Sheep("羊",2);
        f.eat();
        f.drink();
        d.eat();
        d.drink();
        s.eat();
        s.drink();
    }
}
