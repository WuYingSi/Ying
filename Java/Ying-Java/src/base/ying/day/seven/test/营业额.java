package base.ying.day.seven.test;

public class 营业额 {
  public static void main(String[] args) {
    /* 某商场每个季度的营业额如下：单位（万元）
    第一季度：22,66,44
    第二季度：77,33,88
    第三季度：25,45,65
    第四季度：11,66,99
      要求计算出每个季度的总营业额和全年的总营业额
      */
    // 二维数组：存放各个季度的营业额
    int[][] yearArr = {
      {22, 66, 44}, // 一季度
      {77, 33, 88}, // 二季度
      {25, 45, 65}, // 三季度
      {11, 66, 99} // 四季度
    };
    // 变量：表示全年的营业额
    int yearSum = 0;
    // 获取每个季度，即一维数组
    for (int i = 0; i < yearArr.length; i++) {
      // 数组：存放二维数组的各个一维数组（即每个季度的营业额）
      int[] quarterArr = yearArr[i];
      int sum = getSum(quarterArr);
      System.out.println("第" + (i + 1) + "个季度的总营业额为：" + sum);
      yearSum += sum;
    }
    System.out.println("全年的总营业额为：" + yearSum);
  }
  // 方法：计算每个季度的总营业额
  public static int getSum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
}
