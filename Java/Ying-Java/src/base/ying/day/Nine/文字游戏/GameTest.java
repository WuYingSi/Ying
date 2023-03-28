package base.ying.day.Nine.文字游戏;

// 格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候（new对象的时候），这些信息就应该被确定下来。
public class GameTest {
  public static void main(String[] args) {
    // 角色：承太郎、迪奥
    Role r1 = new Role("承太郎", 100);
    Role r2 = new Role("迪奥", 100);
    while (true) {
      // 回合制
      // 角色1攻击角色2
      r1.attack(r2);
      // 判断：血量剩余
      if (r2.getBlood() == 0) {
        System.out.println(r1.getName() + "战胜了" + r2.getName());
        break;
      }
      // 角色2攻击角色1
      r2.attack(r1);
      // 判断：血量剩余
      if (r1.getBlood() == 0) {
        System.out.println(r2.getName() + "战胜了" + r1.getName());
        break;
      }
    }
  }
}
