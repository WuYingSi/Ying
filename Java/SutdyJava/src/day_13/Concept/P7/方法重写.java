package day_13.Concept.P7;

public class 方法重写 {
    public static void main(String[] args) {
        // 创建子类对象
        Cat ddm = new Cat();
        // 调用父类继承而来的方法
        ddm.run();
        // 调用子类重写的方法
        ddm.cry();
    }
}
class Animal  {
    public void run(){
        System.out.println("动物跑的很快！");
    }
    public void cry(){
        System.out.println("动物都可以叫~~~");
    }
}
class Cat extends Animal {
    @Override// 重写方法注解
    public void cry(){
        System.out.println("我们一起学猫叫，喵喵喵！喵的非常好听！");
    }
}