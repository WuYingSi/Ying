package base.ying.day.seven.test;

import java.util.Random;

public class 抢红包 {
  // 一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
  // 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）
  // 888元的奖金被抽出
  // 588元的奖金被抽出
  // 10000元的奖金被抽出
  // 1000元的奖金被抽出
  // 2元的奖金被抽出
  public static void main(String[] args) {
    // 给定一个数组存放奖金
    int bonus[] = {2, 588, 888, 1000, 10000};
    // 给定一个数组用来存放已抽取到的奖金
    int getBonus[] = new int[bonus.length];
    // 抽奖 五次
    Random r = new Random();
    for (int i = 0; i < 5;) {
      // 随机抽取0-5的索引
      int randomIndex = r.nextInt(bonus.length);
      // 抽取的奖项
      int prize = bonus[randomIndex];
      // 判断
      boolean flag =bonus(getBonus, prize);
      if (!flag) {
        // 返回false 则没被抽取过
        // 把奖项放进数组getBonus里
        getBonus[i] = prize;
        i++; // 增加索引
      }
    }
    // 抽取结果
    for (int i = 0; i < getBonus.length; i++) {
      System.out.println(getBonus[i]+"元的奖金被抽出");
    }
  }
  // 方法作用用来判断奖项是否被抽取
  public static boolean bonus(int bonus[], int prize) {
    for (int i = 0; i < bonus.length; i++) {
      if (bonus[i] == prize) {
        return true; // 被抽取返回true
      }
    }
    return false; // 没被抽取则返回false
  }
}
