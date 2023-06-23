package day_13.Concept.P7;

public class 成员变量重名 {
    public static void main(String[] args) {
        // 创建子类对象
        Zi2 z = new Zi2();
        // 调用子类中的show方法
        z.show();
        /*
        演示结果：
        Fu num = 6
        Zi num = 6*/

    }
}
class Fu2 {
    // Fu中的成员变量。
    int num = 5;
}
class Zi2 extends Fu2 {
    // Zi中的成员变量
    int num = 6;

    public void show() {
        // 访问父类中的num
        System.out.println("Fu num=" + num);
        // 访问子类中的num
        System.out.println("Zi num=" + num);
    }
}
