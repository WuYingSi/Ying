package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class P22Demo02 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成

        // JDK7
        // 获取出生年月日的毫秒值
        String birthday = "2003年1月12日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        // 获取现在的毫秒值
        long todayTime = System.currentTimeMillis();
        // 间隔
        long Time = todayTime - birthdayTime;
        System.out.println("活了" + Time / 1000 / 60 / 60 / 24 + "天");


        // JDK8
        LocalDate today = LocalDate.now();// 当前时间
        // 生日时间
        LocalDate birthDate = LocalDate.of(2003, 1, 12);
        System.out.println("相差的天数:" + ChronoUnit.DAYS.between(birthDate, today));
    }
}
