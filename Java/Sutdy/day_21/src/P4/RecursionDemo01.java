package P4;

public class RecursionDemo01 {
    public static void main(String[] args) {
        //需求：利用递归求1-100之间的和
        //100 + 99 + 98 + 97 + 96 + 95 .... + 2 + 1

        //大问题拆解成小问题
        //1~100之间的和 = 100 + （1~99之间的和）
        //1~99之间的和 = 99 + （1~98之间的和）
        //1~98之间的和 = 98 + （1~97之间的和）
        //。。。
        //1~2之间的和 = 2 + （1~1之间的和）
        //1~1之间的和 = 1（递归的出口）

        //核心：
        //1.找出口
        //2.找规律
        System.out.println(getSum(100));
    }
    // 方法：计算到1的数据之和
    public static int getSum(int number) {
        // 当数据为1时返回并停止递归
        if (number == 1) {
            return 1;
        }
        return number + getSum(number - 1);// 每次减一并相加
    }
}
