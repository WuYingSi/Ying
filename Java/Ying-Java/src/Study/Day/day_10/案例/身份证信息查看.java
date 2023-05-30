package Study.Day.day_10.案例;

import java.util.Scanner;

public class 身份证信息查看 {
  //步骤
  //提取7-14位数字：代表出生年月日（7-10年，11-12月，13-14日）
  //提取17位数字：代表性别（单数男，双数女）
  public static void main(String[] args) {
    //键盘录入身份证号码：18位
    Scanner sb = new Scanner(System.in);
    System.out.println("请输入您的身份证号码：");
    String id = sb.next();
    System.out.println("查询到您的出生年月日以及性别为：");
    //提取出生年月日---年（7-10,号码的顺序）
    String year = id.substring(6, 10);//对应的索引的顺序
    //提取出生年月日---月（11-12,号码的顺序）
    String month = id.substring(10, 12);
    //提取出生年月日---日（13-14,号码的顺序）
    String day = id.substring(12, 14);
    System.out.print("出生年月日："+"\t"+year + "年"+month + "月"+day + "日");
    System.out.println();
    //性别：17位
    char gender = id.charAt(16);//索引
    //判断：单数（男），双数（女）
    //根据ASCLL码表应该转换为char类型
    int number = gender - 48;
    if (number % 2 == 0) {
      //双数--女
      System.out.print("性别："+"\t"+"女");
    } else if (number % 2 != 0) {
      //单数--男
      System.out.print("性别："+"\t"+"\t"+"男");
    }

  }
}
