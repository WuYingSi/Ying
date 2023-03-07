package base.ying.day.seven.test;

public class 找质数 {
  // 判断101~200之间有多少个质数，并输出所有质数。
  public static void main(String[] args) {
    // 简单的找质数
    //simple(100);
    // 101~200的范围内的所有质数
    range(101,200);
  }
  // 判断数字是不是质数
  public static void simple(int number) {
    // 判断标记
    boolean flag = true;
    // 从2~number的数字
    for (int i = 2; i < number; i++) {
      if (i % number == 0) {
        flag = false;
        break;
      }
    }
    if (flag) {
      System.out.println("数字" + number + "不是一个质数");
    } else {
      System.out.println("数字" + number + "是一个质数");
    }
  }

  // 判断范围内的质数有哪些
  public static void range(int from, int to) {
    //变量count用来统计有多少个质数
    int count =0;
    for (int i = from; i <= to; i++) {
      // 判断标记
      boolean flag = true;
      // 从2~number的数字
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          flag = false;
          //跳出单层循环
          break;
        }
      }
      if (flag) {
        System.out.println("数字" + i + "是一个质数");
        count++;
      }
    }
    System.out.println("范围内一共有"+count+"个质数");
  }
}
