package Study.Day.Seven;

import java.util.Random;
import java.util.Scanner;

public class 双色球彩票系统 {
  public static void main(String[] args) {
    // 调用生成中奖号码
    int number[] = createNumber();
    System.out.println("--------------");
    for (int i = 0; i < number.length; i++) {
      System.out.print(number[i] + " ");
    }
    System.out.println(" ");
    System.out.println("--------------");

    // 用户购买的彩票号码
    int userNumber[] = userInputNumber();
    // 中奖情况
    // 两个变量分别记录红球和蓝球的中奖个数
    int redCount = 0;
    int blueCount = 0;
    // 中奖红球 前六位
    for (int i = 0; i < userNumber.length - 1; i++) {
      int redNumber = userNumber[i];
      // 内循环 确定中奖号码的位置
      for (int j = 0; j < number.length; j++) {
        // 判断中奖号码与用户号码的位置是否相同 是否相等
        if (redNumber == number[j]) {
          redCount++;
          // 找到循环结果
          break;
        }
      }
    }
    // 中奖蓝球 最后一位
    int blueNumber = userNumber[userNumber.length - 1];
    if (blueNumber == number[number.length - 1]) {
      blueCount++;
    }
    // 中奖奖金
    if (redCount == 6 && blueCount == 1) {
      System.out.println("获得一等奖，奖金1000万元");
    } else if (redCount == 6 && blueCount == 0) {
      System.out.println("获得二等奖，奖金500万元");
    } else if (redCount == 5 && blueCount == 0) {
      System.out.println("获得三等奖，奖金3000元");
    } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
      System.out.println("获得四等奖，奖金200元");
    } else if ((redCount == 4 && blueCount == 0)||(redCount == 3 && blueCount == 1)) {
      System.out.println("获得五等奖，奖金10元");
    } else if ((redCount == 1 && blueCount == 1)||(redCount == 0 && blueCount == 1)||(redCount == 2 && blueCount == 1)) {
      System.out.println("获得六等奖，奖金5元");
    } else {
      System.out.println("谢谢惠顾");
    }
  }
  // 方法：用户的彩票号码
  public static int[] userInputNumber() {
    // 数组：存放用户的彩票号码
    int userNumber[] = new int[7];
    Scanner sc = new Scanner(System.in);
    // 红球号码 --前六位
    for (int i = 0; i < 6; ) {
      System.out.println("请输入" + (i + 1) + "位号码(仅限6位（红球）)");
      int redNumber = sc.nextInt(); // 键盘录入
      // 判断是否在1-33以及不重复
      if (redNumber >= 1 && redNumber <= 33) {
        // 调用方法判断重复性1
        if (!contains(userNumber, redNumber)) {
          userNumber[i] = redNumber;
          i++;
        } else {
          System.out.println("该号码已选中，请重新选择");
        }
      } else {
        System.out.println("号码不在范围内，请重新输入");
      }
    }
    // 蓝球号码 --最后一位
    System.out.println("请输入蓝球号码：");
    while (true) {
      int blueNumber = sc.nextInt();
      if (blueNumber >= 1 && blueNumber <= 16) {
        // 在蓝球号码范围内1-16
        userNumber[userNumber.length - 1] = blueNumber;
        break; // 跳出循环
      } else {
        System.out.println("蓝球号码不在范围内，请重新输入");
      }
    }
    return userNumber;
  }

  // 方法：中奖号码的数组
  public static int[] createNumber() {
    // 数组：存放中奖号码  ; 长度为6+1
    int number[] = new int[7];
    // 规则：前六位（红球1-33）不能重复；最后一位（蓝球1-16）
    // 生成号码
    Random r = new Random();
    // 生成前六位号码（红球）
    for (int i = 0; i < 6; ) {
      int redNumber = r.nextInt(33) + 1; // 1-33
      // 调用判断方法

      if (!contains(number, redNumber)) {
        // 红球号码不重复即添加到中奖号码中
        number[i] = redNumber;
        i++;
      }
    }
    // 生成最后一位号码（蓝球）
    number[number.length - 1] = r.nextInt(16) + 1;

    return number;
  }
  // 方法：判断前六位的号码是否重复
  public static boolean contains(int newNumber[], int number) {
    for (int i = 0; i < newNumber.length; i++) {
      if (newNumber[i] == number) {
        return true;
      }
    }
    return false;
  }
}
