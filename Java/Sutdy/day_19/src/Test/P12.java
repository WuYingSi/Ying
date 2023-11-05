package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P12 {
    public static void main(String[] args) {
        /*
         * 把下面文本中的座机电话，邮箱，手机号，热线都爬取出来
         * 手机号:18512516758，18512508907
         * 联系邮箱:boniu@itcast.cn
         * 座机电话:01036517895，010-98951256
         * 邮箱:bozai@itcast.cn
         * 热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090
         * -------------------------------------------
         * 手机号的正则表达式： 1[3-9]\d{9}
         * 联系邮箱的正则表达式：\w+@[\w&&[^_]]{2,6}(\.[a-zA-Z]{2,3}){1,2}
         * 座机电话的正则表达式：0\d{2,3}-?[1-9]\d{4,9}
         * 邮箱的正则表达式：\w+@[\w&&[^_]]{2,6}(\.[a-zA-Z]{2,3}){1,2}
         * 热线电话的正则表达式：400-?[1-9]\d{2}-?\d[1-9]{4}
         * */
        String s = "电话:18512516758，18512508907" + "或者联系邮箱:boniu@itcast.cn，" +
                "座机电话:01036517895，010-98951256" + "邮箱:bozai@itcast.cn，" +
                "热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090";
        String regex1 = "1[3-9]\\d{9}";// 电话
        String regex2 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}"; // 邮箱
        String regex3 = "0\\d{2,3}-?[1-9]\\d{6,9}"; // 座机电话
        String regex4 = "400-?[1-9]\\d{2}-?[1-9]\\d{3}"; // 热线电话

        String regex = "(1[3-9]\\d{9})|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})" +
                "|(0\\d{2,3}-?[1-9]\\d{4,9})" +
                "|(400-?[1-9]\\d{2}-?[1-9]\\d{3})";

        //1.获取正则表达式的对象
        Pattern p = Pattern.compile(regex);

        //2.获取文本匹配器的对象
        //利用m去读取s，会按照p的规则找里面的小串
        Matcher m = p.matcher(s);
        //3.利用循环获取每一个数据
        while(m.find()){
        String str = m.group();
        System.out.println(str);}
        System.out.println("--------------------------------");



        // 电话
        method(s, regex1);
        System.out.println("--------------------------------");
        // 邮箱
        method(s, regex2);
        System.out.println("--------------------------------");
        // 座机电话
        method(s, regex3);
        System.out.println("--------------------------------");
        // 热线电话
        method(s, regex4);

    }

    private static void method(String str, String regex) {
        // 获取正则表达式规则对象
        Pattern p = Pattern.compile(regex);
        // 获取文本匹配器对象
        Matcher m = p.matcher(str);

        // 获取爬取出来的文字
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }
    }
}
