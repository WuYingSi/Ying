package base.ying.day.seven.test;

public class 数字加密解密 {
  public static void main(String[] args) {
    //  某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
    //  规则如下： 先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。

    // 给定一个的密码数组
    int number = 1983; // 密码
    int temp = number; // 临时变量记录密码
    int count = 0; // 密码位数
    while (number != 0) {
      // 每一次循环去掉最后的一位密码
      number = number / 10;
      count++;
    }
    // 密码数组
    int pw[] = new int[count];
    // 把密码添加数组中
    int index = pw.length - 1; // 数组索引
    while (temp != 0) {
      // 获取密码的每一位数
      int ge = temp % 10;
      // 每次循环去掉最后的一位数
      temp = temp / 10;
      // 把每位密码放到数组中
      pw[index] = ge;
      index--; // 索引每次循环加1
    }
    System.out.print("原密码为：");
    for (int i = 0; i < pw.length; i++) {
      System.out.print(pw[i] + " ");
    }
    System.out.println(" ");
    int newpw[] = numberEncrypt(pw);
    numberDecrypt(newpw);

  }
  // 密码加密
  public static int[] numberEncrypt(int pw[]) {
    // 每位数都加上5
    for (int i = 0; i < pw.length; i++) {
      pw[i] = pw[i] + 5;
    }
    // 每位数都对10取余
    for (int i = 0; i < pw.length; i++) {
      pw[i] = pw[i] % 10;
    }
    // 对数组内的元素进行反转
    // j是从最后的索引开始
    for (int i = 0, j = pw.length - 1; i < j; i++, j--)
    // i从0开始。j从最后开始
    {
      int temp = pw[i];
      pw[i] = pw[j];
      pw[j] = temp;
    }
    // 拼接输出加密后的结果
    //    int number = 0;
    //    for (int i = 0; i < pw.length; i++) {
    //      number = number * 10 + pw[i];
    //    }
    System.out.print("加密后的密码为：");
    for (int i = 0; i < pw.length; i++) {
      System.out.print(pw[i] + " ");
    }
    System.out.println(" ");
    return pw;
  }

  // 密码解密
  public static void numberDecrypt(int pw[]) {
    // 先反转、加10（%10）、减5（加5） 得到原密码
    // 1-反转
    for (int i = 0, j = pw.length - 1; i < j; i++, j--) {
      int temp = pw[i];
      pw[i] = pw[j];
      pw[j] = temp;
    }
    // 2-原：对10取余（%10），即加密后 0-4之间加10；5-9数字不变
    for (int i = 0; i < pw.length; i++) {
      if (pw[i] >= 0 && pw[i] <= 4) {
        pw[i] = pw[i] + 10;
      }
    }
    // 3- 减5
    for (int i = 0; i < pw.length; i++) {
      pw[i] = pw[i] - 5;
    }
    System.out.print("解密后的密码为：");
    for (int i = 0; i < pw.length; i++) {
      System.out.print(pw[i] + " ");
    }
    System.out.println(" ");
  }
}
