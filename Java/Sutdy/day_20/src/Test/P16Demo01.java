package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P16Demo01 {
    public static void main(String[] args) {
        // 创建时间对象
        Date d1 = new Date(500000000000L);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String f1 = sdf1.format(d1);
        System.out.println(f1);
    }
}
