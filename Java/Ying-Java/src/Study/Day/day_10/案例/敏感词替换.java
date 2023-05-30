package Study.Day.day_10.案例;

import java.util.Scanner;

public class 敏感词替换 {
  //键盘录入一个 字符串，如果字符串中包含（TMD），则使用***替换
  public static void main(String[] args) {
    //键盘录入
    Scanner sb =new Scanner(System.in);
    String text = sb.next();
    //判断
    text = text.replace("TMD", "***");
    System.out.println(text);
  }
}
