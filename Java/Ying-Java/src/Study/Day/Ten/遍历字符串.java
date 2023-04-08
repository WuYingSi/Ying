package Study.Day.Ten;

import java.util.Scanner;
public class 遍历字符串 {
  // 键盘录入一个字符串，使用程序实现在控制台遍历该字符串
  public static void main(String[] args) {
      //键盘录入
      Scanner sb =new Scanner(System.in);
      System.out.println("请输入一个字符串");
      String str=sb.next();
      //遍历
      for (int i = 0; i < str.length(); i++) {
          char c =str.charAt(i);
          System.out.print(c+" ");
      }

  }
}
