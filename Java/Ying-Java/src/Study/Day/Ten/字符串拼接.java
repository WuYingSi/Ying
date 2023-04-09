package Study.Day.Ten;

public class 字符串拼接 {
    /*定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
    例如，数组为 int[] arr = {1,2,3};
    执行方法后的输出结果为：[1, 2, 3]*/
    public static void main(String[] args) {
        //数组：
        int[] arr = {1, 2, 3};
        //String 为数组的字符串
        String str = arrToString(arr);
        printf(str);
        System.out.println("--------------------");
        printf_2(arr);
    }
    //方法：把数组arr存放进字符串变量内
    public static String arrToString(int[] arr) {
        //判断：数组内是否有存放
        if (arr==null){
            return "";//数组没有内容
        }
        if (arr.length==0){
            return "[]";//数组里没内容
        }
        //字符串变量：存放数组arr
        String s = "";
        //加入[
        s = s + "[";
        for (int i = 0; i < arr.length; i++) {
            //判断：是否加,
            if(i==arr.length-1){
                s = s + arr[i];
            }else{
                s=s+arr[i]+", ";
            }
        }
        //加入]
        s = s + "]";
        return s;
    }
    //方法：打印
    public static void printf(String s){
        System.out.println(s);
    }
    //方法：直接传入数组打印出字符串
    public static void printf_2(int[] arr){
        // 添加[
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //判断：是否加,
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        //添加]
        System.out.print("]");
    }
}
