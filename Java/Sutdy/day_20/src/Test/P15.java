package Test;

import java.util.Date;
import java.util.Random;

public class P15 {
    public static void main(String[] args) {
        /*
        时间计算
        需求1: 打印时间原点开始一年之后的时间
        需求2: 定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        */
        // 需求1
        method01();
        // 需求2
        method02();

    }

    private static void method02() {
        // 创建两个随机对象来进行比较
        Random r = new Random();
        Date d1=new Date(r.nextLong());
        Date d2=new Date(r.nextLong());

        
    }

    private static void method01() {

        // 获取时间原点
        Date d = new Date(0L);
        long T1 = d.getTime();// 时间原点毫秒值
        long time = T1 + 1000L * 60 * 60 * 24 * 365;
        d.setTime(time);// 把一年后的毫秒值转换为date
        System.out.println(d);
    }

}
