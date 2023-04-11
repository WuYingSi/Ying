package Study.Day.Ten;

import java.util.Scanner;

public class 用户登录 {
  // 已知用户名和密码，请用程序实现模拟用户登录。
  // 总共给三次机会，登录之后，给出相应的提示
  public static void main(String[] args) {
    // 正确的账号与密码
    String Rusername = "xiaoying";
    String Rpassword = "12345678";
    // 登录过程 三次机会
    Scanner sb = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      System.out.println("请输入用户名：");
      String username = sb.next();
      System.out.println("请输入密码：");
      String password = sb.next();
      if (username.equals(Rusername) && password.equals(Rpassword)) {
        System.out.println("登录成功");
        break;
      } else {
        System.out.println("用户名或者密码错误");
      }
    }
  }
}
