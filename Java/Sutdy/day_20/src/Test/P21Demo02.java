package Test;

import java.util.Scanner;

public class P21Demo02 {
    public static void main(String[] args) {
        /*
            自己实现parseInt方法的效果，将字符串形式的数据转成整数。
            要求:
            字符串中只能是数字不能有其他字符；最少一位，最多10位；0不能开头
        */
        String str = "a520";
//        Scanner sc = new Scanner(System.in);
//        String str2 = sc.nextLine();
        /*
         只能是数字 \\d
         最少一位，最多10位 {0,9}
         0不能开头[1-9]
         */
        if (!str.matches("[1-9]\\d{0,9}")) {
            // 错误格式
            System.out.println("格式错误");
        } else {
            // 正确格式
            int numResult = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                numResult = numResult * 10 + c;
            }
            System.out.println(numResult);
            System.out.println("--------------------------------");
            // 验证是否转换成整数
            System.out.println(str+1);
            System.out.println(numResult+1);
        }

    }
}
