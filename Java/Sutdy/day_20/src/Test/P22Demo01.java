package Test;

import javax.xml.transform.Result;

public class P22Demo01 {
    public static void main(String[] args) {
        /*
            定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
         */
        int Number = 100;
        String resultStr = toBinaryString(Number);
        System.out.println(resultStr);
    }

    public static String toBinaryString(int num) {
        // 将一个十进制整数转成字符串表示的二进制

        // 创建一个对象用来拼接字符串
        StringBuilder sb = new StringBuilder();
        // 获取余数，即每一位二进制数
        while (true) {
            // 判断商是否为0
            if (num == 0) {
                break;
            }
            // 需先获取余数再获取商，不然数值会出错
            // 获取余数
            int result = num % 2;
            // 拼接：从头部开始插入数值
            sb.insert(0, result);
            // 获取商
            num /= 2;
        }
        return sb.toString();
    }
}
