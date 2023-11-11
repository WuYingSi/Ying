package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P16Demo02 {
    public static void main(String[] args) throws ParseException {
        /*
        * 假设，你初恋的出生年月日为:2000-11-11
        * 请用字符串表示这个数据，并将其转换为:2000年11月11日
        * */

        String str ="2000-11-11";
        // 使字符串转换为时间对象
        SimpleDateFormat sdf01 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf01.parse(str);
        // 再使时间对象转换成新的字符串
        SimpleDateFormat sdf02=new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf02.format(date);
        System.out.println(result);

    }
}
