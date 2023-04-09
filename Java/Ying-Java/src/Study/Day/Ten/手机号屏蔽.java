package Study.Day.Ten;

import java.util.Scanner;

public class 手机号屏蔽 {
  //以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
  public static void main(String[] args) {
    //键盘录入手机号码：11位数
    Scanner sb = new Scanner(System.in);
    String Phone= sb.next();
    //先截取前三位，在截取后四位，然后与****拼接
    //前三位
    String start = Phone.substring(0, 3);
    //后四位
    String end=Phone.substring(7);//从索引7一直截取到末尾
    // 拼接
    String result=start+"****"+end;
    //打印结果
    System.out.println(result);
  }
}
