package P4;

public class RecursionDemo02 {
    public static void main(String[] args) {
        //需求:用递归求5的阶乘，并把结果在控制台输出
        System.out.println(getFactorialRecursion(5));
    }
    // 方法：计算阶乘
    private static int getFactorialRecursion(int number) {
        // 当数据为1时返回并停止递归
        if (number == 1) {
            return 1;
        }
        return number * getFactorialRecursion(number - 1);// 每次减一并相乘
    }
}
