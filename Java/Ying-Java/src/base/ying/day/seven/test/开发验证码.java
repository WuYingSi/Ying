package base.ying.day.seven.test;

import java.util.Random;

public class 开发验证码 {
  public static void main(String[] args) {
    // 定义方法实现随机产生一个5位的验证码
    // 验证码格式：长度为5 前四位是大写字母或者小写字母 最后一位是数字
    randomPassword();
  }

  public static void randomPassword() {
    // 前四位从数组里面抽取
    // 数组chs里面存放大写字母和小写字母
    char chs[] = new char[52];
    for (int i = 0; i < chs.length; i++) {
      // 添加大小写字母 -- 根据ASCII码表
      if (i <= 25) {
        // 添加小写字母 a--97
        chs[i] = (char) (97 + i);
      } else {
        // 添加大写字母 A--65
        chs[i] = (char) (65 + i - 26);
      }
    }
    // 获取数组内的随机索引
    Random r = new Random();
    // 定义一个字符串变量用来记录最终的验证码
    String result = "";
    // 获取前四位随机字母验证码
    for (int i = 0; i < 4; i++) {
      int randomIndex = r.nextInt(chs.length); // 范围从0-51，即52也是数组chs的元素数量
      // 每生产一个随机字母都放到字符串变量内
      result = result + chs[randomIndex];
    }
    // 获取最后一位数字验证码
    int randomNumber = r.nextInt(10); // 范围从0-9，即10
    // 最终的五位验证码
    result = result + randomNumber;
    System.out.println(result);
  }
}
