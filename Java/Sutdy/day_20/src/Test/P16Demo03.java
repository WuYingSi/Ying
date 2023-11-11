package Test;

import P16.SimpleDateFormatDemo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P16Demo03 {
    public static void main(String[] args) throws ParseException {
        /* 需求:
            秒杀活动开始时间:2023年11月11日 0:0:0(毫秒值)
            秒杀活动结束时间:2023年11月11日 0:10:0(毫秒值)

            小贾下单并付款的时间为:2023年11月11日 0:01:0
            小皮下单并付款的时间为:2023年11月11日 0:11:0
            用代码说明这两位同学有没有参加上秒杀活动?
         */
        // 小贾
        String t1 = "2023年11月11日 0:01:0";
        // 小皮
        String t2 = "2023年11月11日 0:11:0";
        method(t2);
    }

    private static void method(String orderTime) throws ParseException {
        // 字符串转换成时间对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        // 获取秒杀活动的时间区间
        String time1 = "2023年11月11日 0:0:0";// 开始
        String time2 = "2023年11月11日 0:10:0";// 结束
        Date date1 = sdf.parse(time1); // 开始
        Date date2 = sdf.parse(time2); // 结束
        // 秒杀活动的毫秒值区间
        long startTime = date1.getTime();
        long endTime = date2.getTime();


        // 把下单时间转换为时间对象
        Date d1 = sdf.parse(orderTime);
        long resultTime = d1.getTime();

        // 判断有没有下单成功
        if ((resultTime >= startTime) && (resultTime <= endTime)) {
            System.out.println("该用户下单成功");
        } else {
            System.out.println("该用户下单失败");
        }
    }
}
