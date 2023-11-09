package P13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo08 {
    public static void main(String[] args) {
        //public String[] split(string regex): 按照正则表达式的规则切割字符串
        //public String replaceAll(String regex,String newStr): 按照正则表达式的规则进行替换


        /*
            有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
            要求1:把字符串中的三个姓名切割出来
            要求2:把字符串中三个姓名之间的字母替换为vs
         */

        // 要求1
        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //细节:
        //方法在底层跟之前一样也会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容，只要有满足的，那么就切割。
        System.out.println("--------------------------------");
        // 要求2
        // 细节:
        // 方法在底层跟之前一样也会创建文本解析器的对象
        // 然后从头开始去读取字符串中的内容，只要有满足的，那么就用第一个参数去替换。
        String result1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result1);
    }
}
