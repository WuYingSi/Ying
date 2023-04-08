package Study.Day.Ten;

import java.util.Scanner;

public class 对称字符串 {
  //键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
  //对称字符串：123321、111
  //非对称字符串：123123
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("<是否为对称字符串诊断工具>");
    System.out.println("请输入要判断的字符串：");
    String str1 = sc.next();
    //把里面的字符串内容存放(StringBuilder)进行反转(reverse)再转换为String类型(toString)
    String str2 = new StringBuilder(str1).reverse().toString();
    //比较(equals)
    if (str1.equals(str2)) {
      //确定是对称字符串
      System.out.println("是");
    } else {
      //不是对称字符串
      System.out.println("不是");
    }
  }
}
