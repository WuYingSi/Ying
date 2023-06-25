package day_14.Concept.P3;

public class 引用类型转换 {
    public static void main(String[] args) {
        // 向上转型
        Animal2 a = new Cat2();
        a.eat(); 				// 调用的是 Cat 的 eat

        // 向下转型
        Cat2 c = (Cat2)a;
        c.catchMouse(); 		// 调用的是 Cat 的 catchMouse
    }
}
abstract class Animal2 {
    abstract void eat();
}

class Cat2 extends Animal2 {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog2 extends Animal2 {
    public void eat() {
        System.out.println("吃骨头");
    }
    public void watchHouse() {
        System.out.println("看家");
    }
}
