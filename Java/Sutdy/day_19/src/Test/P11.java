package Test;

public class P11 {
    /*
     * 请编写正则表达式验证用户名是否满足要求。要求:大小写字母，数字，下划线一共4-16位
     * 请编写正则表达式验证身份证号码是否满足要求
     * 简单要求:
     *   18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
     * 复杂要求:
     *   按照身份证号码的格式严格要求。
     * 身份证号码：
     * 41080119930228457x 510801197609022309
     * 15040119810705387X 130133197204039024 430102197606046442
     * */
    public static void main(String[] args) {
        /*
        * 用户名
        * 要求:大小写字母，数字，下划线一共4-16位
        * */
        String regex03="\\w{4,16}";
        System.out.println("xiaoying".matches(regex03));
        System.out.println("#123".matches(regex03));
        System.out.println("----------------------------");
        // 身份证号码
        /*
         * 简单要求
         * 第一位不能为0
         * 后16位随机数字
         * 第十八位大写或小写的x，或者数字
         * */
        String regex01 = "[1-9]\\d{16}(\\d|X|x)";
        // [1-9]\d{16}[\dXx] : []里只能出现一个
        // [1-9]\d{16}(\d|(?i)x)
        //忽略大小写的书写方式：(?i)字母
        //在匹配的时候忽略abc的大小写
        System.out.println("41080119930228457x".matches(regex01));
        System.out.println("510801197609022309".matches(regex01));
        System.out.println("15040119810705387X".matches(regex01));
        System.out.println("130133197204039024".matches(regex01));
        System.out.println("430102197606046442".matches(regex01));
        System.out.println("----------------------------");
        /*
         * 复杂要求
         *
         * 前面6位:省份，市区，派出所等信息，第一位不能是0，后面5位是任意数字       [1-9]\\d{5}
         * 年的前半段: 18 19 20                                                (18|19|20)
         * 年的后半段: 任意数字出现两次                                           \\d{2}
         * 月份: 01~ 09 10 11 12                                               (0[1-9]|1[0-2])
         * 日期: 01~09 10~19 20~29 30 31                                       (0[1-9]|[12]\\d|3[01])
         * 后面四位: 任意数字出现3次 最后一位可以是数字也可以是大写x或者小写x        \\d{3}[\\dXx]
         * */
        //String regex02 = "(^\\d{8}(0\\d|10|11|12)([0-2]\\d|30|31)\\d{3}$)|(^\\d{6}(18|19|20)\\d{2}(0\\d|10|11|12)([0-2]\\d|30|31)\\d{3}(\\d|X|x)$)";
        String regex02="[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";
        System.out.println("445221200301126818".matches(regex02));
        System.out.println("445221200301126818".matches(regex01));dwwuyingsihdalkhjjjkk4511dadddafadfwdwuhhkahkjhhhhhhhhhhhhdjdjakhddddd
    }

}
