package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class P21Demo01 {
    public static void main(String[] args) {
        // 键盘录入一些1~100之间的整数，并添加到集合中。直到集合中所有数据和超过200为止

        // 创建一个集合
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // 键盘录入
        while (true) {
            System.out.println("请输入一个整数");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            if (num < 1 || num > 100) {
                System.out.println("输入的整数不在正确范围，请重新输入");
                continue;// 重新开始循环
            }
            // 把键盘录入的整数存放进集合中
            //细节:
            //num:基本数据类型
            //集合里面的数据是Integer，在添加数据的时候触发了自动装箱
            list.add(num);
            // 集合中数据和
            int result=getSum(list);
            if (result>200){
                System.out.println("集合内数据和已超过二百");
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            //i :索引
            //list.get(i);
            int num = list.get(i);
            sum = sum + num;//+=
        }
        return sum;
    }
}
