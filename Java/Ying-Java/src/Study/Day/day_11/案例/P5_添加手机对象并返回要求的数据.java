package Study.Day.day_11.案例;

import Study.Javabean.Phone;

import java.util.ArrayList;

public class P5_添加手机对象并返回要求的数据 {
    /*
     * 需求:
     * 定义Javabean类:PhonePhone属性:品牌，价格。
     * main方法中定义一个集合，存入三个手机对象。
     * 分别为:小米，1000。苹果，8000。锤子2999.
     * 定义一个方法，将价格低于3000的手机信息返回
     */
    public static void main(String[] args) {
        // 集合：存放手机对象
        ArrayList<Phone> list = new ArrayList<>();
        // 三个手机对象
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> newP = findPhone(list);
        for (int i = 0; i < newP.size(); i++) {
            Phone newP1 = newP.get(i);
            System.out.println(newP1.getBrand()+", "+newP1.getPrice());
        }

    }

    // 方法：将价格低于3000的手机信息返回
    public static ArrayList<Phone> findPhone(ArrayList<Phone> list) {
        ArrayList<Phone> newP=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone P = list.get(i);
            if (P.getPrice() < 3000) {
                newP.add(P);
            }
        }
        return newP;
    }
}
