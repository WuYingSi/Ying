package day_14.Concept.P3;

public class 多态的弊端 {
    public static void main(String[] args){
        Animal1 a = new Cat1();
        a.eat();
        //a.catchMouse();//编译报错，编译看左边，Animal没有这个方法
    }
}
class Animal1{
    public  void eat(){
            System.out.println("动物吃东西！");
    }
}
class Cat1 extends Animal1 {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog1 extends Animal1 {
    public void eat() {
        System.out.println("吃骨头");
    }
}

class Test{

}
