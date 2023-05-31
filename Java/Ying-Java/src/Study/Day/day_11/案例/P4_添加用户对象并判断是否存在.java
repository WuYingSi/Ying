package Study.Day.day_11.案例;

import Study.Javabean.User;

import java.util.ArrayList;
import java.util.Scanner;

public class P4_添加用户对象并判断是否存在 {
    public static void main(String[] args) {
        /*
        需求:
        1，main方法中定义一个集合，存入三个用户对象用户属性为:id，username，password
        2，要求:定义一个方法，根据id查找对应的用户信息。
        如果存在，返回true，如果不存在，返回false
         */
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("1", "zhangsan", "123");
        User u2 = new User("2", "lisi", "123");
        User u3 = new User("3", "wangwu", "123");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        // 键盘录入要查找的id
        Scanner sc = new Scanner(System.in);
        String newId = sc.next();
        // 根据id查找对应的用户信息
        int re = findindex(list, newId);
        System.out.println("索引为" + re);
        boolean flag =findUser(list, newId);
        System.out.println(flag);
    }

    // 方法：根据id查找对应的用户信息 返回true false
    public static boolean findUser(ArrayList<User> list, String id) {
        return findindex(list, id) >= 0;
    }

    // 方法：根据id查找对应的用户信息 返回索引
    public static int findindex(ArrayList<User> list, String id) {
        // 循环遍历获得集合里每一个对象
        for (int i = 0; i < list.size(); i++) {
            // 判断对象的id是否与传入的id相同
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }

        return -1;
    }
}
