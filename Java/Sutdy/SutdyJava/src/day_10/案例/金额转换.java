package Study.Day.day_10.案例;

import java.util.Scanner;

public class 金额转换 {
  /*把2135变成：零佰零拾零万贰仟壹佰叁拾伍元
  把789变成：零佰零拾零万零仟柒佰捌拾玖元*/
  //步骤
  //第一步：把数字转换为繁体中文
  //第二步：补齐七位数
  //第三步：补充单位
  public static void main(String[] args) {
    //键盘录入数字金额
    Scanner sb = new Scanner(System.in);
    //变量：存放金额
    int price;
    //while循环：获取一个正确的金额
    while (true) {
      System.out.println("请输入一个数字金额：");
      price = sb.nextInt();
      //判断金额是否符合要求0到七位数之间
      if (price >= 0 && price <= 9999999) {
        break;//获取到正确金额，退出循环
      } else {
        System.out.println("金额不符合要求，请重新输入");
        System.out.println();
      }
    }
    //第一步：把数字转换为繁体中文
    //字符串：拼接繁体中文
    String bigStr = "";
    //while循环：获取金额中的每一位数字
    while (true) {
      //获取最后的一位数字
      int later = price % 10;
      //调用方法：存放繁体中文
      String CapNu = getCapitalNumber(later);
      //拼接
      bigStr = CapNu + bigStr;//把倒序提取的数字按照正序来进行拼接
      //获取数字后调用方法查找相对应的繁体中文
      //获取最后一位数字后去除，再重复
      price = price / 10;
      if (price == 0) {
        break;
      }
    }
    //第二步：补齐七位数
    int count = 7 - bigStr.length();//已有几位数，即需补几位零
    for (int i = 0; i < count; i++) {
      //缺几位数循环几次
      //补充“零”
      bigStr = "零" + bigStr;
    }
    //第三步：补充单位--插入
    //数组；补充：佰 拾 万 仟 佰 拾 元
    String[] big = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
    //变量result：最终结果
    String result="";
    //逐一遍历
    for (int i = 0; i < bigStr.length(); i++) {
      char c = bigStr.charAt(i);//字符串bigStr里的每一个字符
      result=result+c+big[i];//big[i]：补充数组中的元素
    }
    //打印结果
    System.out.println(result);
  }

  //方法：把单独一个数字变成繁体中文数字
  //传递来的只能是单独一个数字
  public static String getCapitalNumber(int number) {
    //繁体数字用数组存放
    //根据索引来查找：0零1壹2贰3叁4肆5伍6陆7柒8捌9玖
    String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
    //返回对应数组的繁体中文数字
    return arr[number];
  }
}