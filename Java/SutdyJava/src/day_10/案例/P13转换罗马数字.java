package Study.Day.day_10.案例;

import java.util.Scanner;

public class P13转换罗马数字 {
    /*
    键盘录入一个字符串
    要求1：长度为小于等于9
    要求2：只能是数字
    将内容变成罗马数字
    下面是阿拉伯数字跟罗马数字的对比关系
    I-1、II-2、III-3、IV-4、V-5、VI-6、VII-7、VIII-8、IX-9
    注意点:
    罗马数字里面是没有0的
    如果键盘录入的数字包含0，可以变成" "(长度为0的字符串)
     */
    public static void main(String[] args) {
        //键盘录入
        Scanner sb = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个数字字符串：");
            str = sb.next();
            //字符串是否为数字
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }
        StringBuilder sa1 = new StringBuilder();
        StringBuilder sa2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);// 获取字符串里的每一个字符
            int number = c - '0';// 把字符转换为数字
            sa1.append(changeLuoMa_1(number));
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);// 获取字符串里的每一个字符
            sa2.append(changeLuoMa_2(c));
        }
        System.out.println(sa1);
        System.out.println(sa2);
    }

    //方法：把字符串里的数字转换成罗马数字--查表法
    public static String changeLuoMa_1(int number) {
        //数组：存放罗马数字
        String[] arr = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return arr[number];
    }

    //利用switch进行匹配
    public static String changeLuoMa_2(char number) {
        String str = switch (number) {
            case '0' -> " ";
            case '1' -> "I";
            case '2' -> "II";
            case '3' -> "III";
            case '4' -> "IV";
            case '5' -> "V";
            case '6' -> "VI";
            case '7' -> "VII";
            case '8' -> "VIII";
            case '9' -> "IX";
            default -> "";
        };
        return str;
    }

    //方法：校验字符串是否满足要求
    public static boolean checkStr(String str) {
        //判断
        //长度小于等于9
        if (str.length() > 9) {
            return false;
        }
        //内容只能为数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
