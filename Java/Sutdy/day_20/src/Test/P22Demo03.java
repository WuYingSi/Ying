package Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class P22Demo03 {
    public static void main(String[] args) {
        /*
            判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断提示:
            二月有29天是闰年；一年有366天是闰年
        */

        // JDK7
        Calendar c = Calendar.getInstance();
        // 设置年份时间
        int year = 2000;
        c.set(year, 2, 1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        // 判断是否为闰年（二月有29天是闰年）
        int day = c.get(Calendar.DAY_OF_MONTH);
        if (day == 29) {
            System.out.println(year + "年为闰年");
        } else if (day == 28) {
            System.out.println(year + "年不是闰年");
        }
        System.out.println("----------------------------------------------------------------");
        method();

        //jdk8
        //月份的范围:1~12
        //设定时间为2000年的3月1日
        LocalDate ld = LocalDate.of(2001, 3, 1);
        //把时间往前减一天
        LocalDate ld2 = ld.minusDays(1);
        //获取这一天是一个月中的几号
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);

        //true:闰年
        //false:平年
        System.out.println(ld.isLeapYear());

    }

    // 获取现在今年是否为闰年
    private static void method() {
        // 获取现在时间的年份
        int year = Calendar.getInstance().get(Calendar.YEAR);
        // 获取3月1号的前一天是二月多少号
        Calendar c = new GregorianCalendar(year, Calendar.MARCH, 1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        // 判断是否为闰年（二月有29天是闰年）
        if (day == 29) {
            System.out.println(year + "年为闰年");
        } else if (day == 28) {
            System.out.println(year + "年不是闰年");
        }
    }
}
