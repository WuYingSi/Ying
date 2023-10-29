package day_15.Concept.P7.成员内部类.调用方式1;

public class Test {
    public static void main(String[] args) {
        //  宿主：外部类对象。
        // Outer out = new Outer();
        // 创建内部类对象。
        Outer.Inner oi = new Outer().new Inner();
        oi.method();
    }
}
