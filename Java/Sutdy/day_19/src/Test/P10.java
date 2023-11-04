package Test;

public class P10 {
    /*
     * 请编写正则表达式验证用户输入的手机号码是否满足要求。
     * 请编写正则表达式验证用户输入的邮箱号是否满足要求。
     * 请编写正则表达式验证用户输入的电话号码是否满足要求
     * 验证手机号码 13112345678 13712345667 13945679027 139456790271
     * 验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434
     * 验证邮箱号码 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
     * */
    public static void main(String[] args) {
        /*
         * 手机号：
         * 长度为11位；第一位为1；第二位为3-9；后面九位为0-9
         * */
        String Regex01 = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(Regex01));// 验证手机号码
        System.out.println("-------------------------------");

        /*
        * 座机号码
        * 区号：第一位为0；从第二位开始可以是任意的数字，可以出现2到3次---\\d{2,3}
        * - 表示次数，0次或一次 ---- -?
        * 后置号码的第一位也不能以0开头，从第二位开始可以是任意的数字，号码的总长度:5-10位
        * */
        String Regex02 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(Regex02));
        System.out.println("-------------------------------");

        /*
        * 邮箱号码
        * 1 @的左边：任意的字母数字下划线，至少出现一次 --- \\w+
        * 2 @
        * 3 .的左边
        *   任意的字母数字(没有包括下划线),出现二到六次 --- [\\w&&[^_]]{2,6}
        * 4 .的右边
        *   大写小写字母，出现二到三次 --- [a-zA-Z]{2,3}
        * 5 @后面的可能会出现一到二次 {1,2}
        * */
        String Regex03 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(Regex03));
        System.out.println("zhangsan@itcast.cnn".matches(Regex03));
        System.out.println("dlei0009@163.com".matches(Regex03));
        System.out.println("dlei0009@pci.com.cn".matches(Regex03));

    }
}
