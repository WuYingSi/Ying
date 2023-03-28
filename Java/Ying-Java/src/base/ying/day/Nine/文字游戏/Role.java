package base.ying.day.Nine.文字游戏;

import java.util.Random;

// 格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候（new对象的时候），这些信息就应该被确定下来。
public class Role {
  // 姓名，血量
  private String name;
  private int blood;
  // 空参
  public Role() {}
  //
  public Role(String name, int blood) {
    this.name = name;
    this.blood = blood;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBlood() {
    return blood;
  }

  public void setBlood(int blood) {
    this.blood = blood;
  }
  // 方法：攻击方式
  public void attack(Role role) {
    // 方法调用者攻击参数Role
    // hurt：造成的伤害（1-20）
    Random r = new Random();
    int hurt = r.nextInt(20) + 1;
    // remainBlood：剩余血量
    int remainBlood = role.getBlood() - hurt;
    // 验证血量是否为负数 负数取0
    remainBlood = remainBlood < 0 ? 0 : remainBlood;
    // 把剩余血量应用到角色二里
    role.setBlood(remainBlood);
    // 方法调用者：this
    System.out.println(
        this.getName()
            + "的攻击对"
            + role.getName()
            + "造成了"
            + hurt
            + "点伤害"
            + role.getName()
            + "剩下"
            + remainBlood
            + "点血量");
  }
}
