package Study.Day.day_13.Case.P2;

import Study.Day.day_13.Tool.ArrayUtil;

public class 定义数组工具类TestDome {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String result_1= ArrayUtil.printArr(arr);
        System.out.println(result_1);
        double result_2= ArrayUtil.getAverage(arr);
        System.out.println(result_2);
    }
}
