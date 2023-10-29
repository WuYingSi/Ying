package Study.Day.day_10.案例;

public class P14调整字符串 {
    /*
    给定两个字符串A和B
    A的旋转操作就是将A最左边的字符移动到最右边
    例如,若A='abcde'，在移动一次之后结果就是bcdea'
    如果在若干次调整操作之后，A 能变成B，那么返回True
    如果不能匹配成功，则返回false
    */
    public static void main(String[] args) {
        String A = "abcde";
        String B = "bcdea";
        boolean re = check(A, B);
        System.out.println(re);
    }

    // 方法：校验A和B是否匹配成功
    public static boolean check(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            //A = rotateStr1(A);
            A = rotateStr2(A);
            // 判断是否匹配
            if (A.equals(B)) {
                return true;
            }
        }
        return false;
    }

    //方法：旋转字符串，将A最左边的字符移动到最右边
    public static String rotateStr1(String str) {
        //利用subString进行截取，把左边的字符截取出来拼接到右侧上
        char first = str.charAt(0);// 获取第一个字符
        String end = str.substring(1);// 获取剩余的字符
        return end + first;
    }

    //方法：旋转字符串，将A最左边的字符移动到最右边
    public static String rotateStr2(String str) {
        //把字符串先转换成一个字符数组，然后调整字符数组里面数据，最后再把字符数组变成字符串
        char[] arr = str.toCharArray();// 把字符串转换为数组
        char first = arr[0];// 获取数组第一个字符
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];// 把数组内的字符往前移动一个位置
        }
        arr[arr.length-1]=first;// 把原数组第一个字符放到最后
        return new String(arr);// 把数组转换成字符串
    }
}
