package day_13.Concept.P7;

public class 成员变量不重名 {
    public static void main(String[] args) {
        // 创建子类对象
        Zi z = new Zi();
        // 调用子类中的show方法
        z.show_1();
        /*演示结果：
        Fu num = 5
        Zi num2 = 6*/
    }
}
class Fu {
    // Fu中的成员变量
    int num = 5;
}
class Zi extends Fu {
    // Zi中的成员变量
    int num2 = 6;

    // Zi中的成员方法
    public void show_1() {
        // 访问父类中的num
        System.out.println("Fu num="+num); // 继承而来，所以直接访问。
        // 访问子类中的num2
        System.out.println("Zi num2="+num2);
    }
}

