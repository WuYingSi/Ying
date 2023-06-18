package day_06;

public class test {
  public static void main(String[] args) {
    // 定义一个数组
    int arr[] = {1, 6, 7, 46, 13, 79, 63, 120, 12};
    //调用方法copyOfRange
    int newarr[] = copyOfRange(arr, 3, 7);
    //遍历数组
    for (int n = 0; n < newarr.length; n++) {
      System.out.print(newarr[n] + " ");
    }
  }

  // 方法：一个数组从索引from到索引to的数据复制到一个新数组里
  public static int[] copyOfRange(int arr[], int from, int to) {
    // 定义一个数组：(动态初始化)数组里面的元素个数为to-from
    int newArr[] = new int[to - from];
    // 变量index为伪造索引
    int index = 0;
    for (int i = from; i < to; i++) {
      newArr[index] = arr[i];
      index++;
    }
    return newArr;
  }

  // 方法：求数组的最大值
  public static int max(int arr[]) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  // 方法：数组的遍历
  public static void print(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        System.out.print(arr[i]);
      } else {
        System.out.print(arr[i] + ",");
      }
    }
    System.out.println("]");
  }
}
