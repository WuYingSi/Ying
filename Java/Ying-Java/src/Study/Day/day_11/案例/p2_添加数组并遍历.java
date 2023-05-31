package Study.Day.day_11.案例;

import java.util.ArrayList;

public class p2_添加数组并遍历 {
    public static void main(String[] args) {
        //需求:定义一个集合，添加数字，并进行遍历
        //遍历格式参照:[元素1,元素2,元素3]
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
