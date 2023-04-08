package Study.Day.Ten;

import java.util.Scanner;

public class 字符串反转 {
    /*定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
    例如，键盘录入 abc，输出结果 cba*/
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sb = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sb.next();

        System.out.print("正向：");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print(c);
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.print("反向：");
        reverser(str);
    }

    public static void reverser(String str) {
        //for循环：反向循环遍历
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            System.out.print(c);
        }
    }
}
