package day_15.Concept.P7.面试题;

public class Outer {	// 外部类
    private int a = 30;

    // 在成员位置定义一个类
    class inner {
        private int a = 20;

        public void method() {
            int a = 10;
            System.out.println(a);	// 10   答案：a
            System.out.println(this.a);	// 20	答案：this.a
            System.out.println(Outer.this.a);	// 30	答案：Outer.this.a
        }
    }
}
