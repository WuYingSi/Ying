package day_13.Concept.P7;

public class super访问父类成员变量 {
    public static void main(String[] args) {
        // 创建子类对象
        Zi3 z = new Zi3();
        // 调用子类中的show方法
        z.show();
        /*演示结果：
        method num=1
        Zi num=6
        Fu num=5*/
    }
}
class Fu3 {
    // Fu中的成员变量。
    int num = 5;
}

class Zi3 extends Fu3 {
    // Zi中的成员变量
    int num = 6;

    public void show() {
        int num = 1;

        // 访问方法中的num
        System.out.println("method num=" + num);
        // 访问子类中的num
        System.out.println("Zi num=" + this.num);
        // 访问父类中的num
        System.out.println("Fu num=" + super.num);
    }
}


