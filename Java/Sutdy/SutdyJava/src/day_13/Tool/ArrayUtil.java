package Study.Day.day_13.Tool;

public class ArrayUtil {
    // 私有化构造方法
    private ArrayUtil() {
    }

    // 返回整数数组的内容
    public static String printArr(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < array.length; i++) {
            // 最后一位元素后不加逗号
            if (i == array.length - 1) {
                result.append(array[i]);
            } else {
                result.append(array[i]).append(",");
            }
        }
        result.append("]");
        return result.toString();
    }

    // 返回平均值
    public static double getAverage(int[] array) {
        double sum = 0;// 总得
        // 数组内的数据累加
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
