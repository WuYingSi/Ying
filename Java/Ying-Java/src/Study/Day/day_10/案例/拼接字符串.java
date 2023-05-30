package Study.Day.day_10.案例;

public class 拼接字符串 {
  //定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回。
  /*调用该方法，并在控制台输出结果。
  例如：数组为int[] arr = {1,2,3};
  执行方法后的输出结果为：[1, 2, 3]*/
  public static void main(String[] args) {
    //定义数组arr
    int[] arr = {1, 2, 3};
    //调用方法
    String result = arrToString(arr);
    //打印
    System.out.println(result);
  }

  public static String arrToString(int[] arr) {
    //定义字符串对象容器sb
    StringBuilder sb = new StringBuilder();
    //存放[
    sb.append("[");
    //存放数组内的元素
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1){
        //为数组内的最后一个元素
        sb.append(arr[i]);
      }else {
        //数组内的元素--需添加","
        sb.append(arr[i]).append(", ");
      }
    }
    //存放]
    sb.append("]");
    //返回字符串类型--需用toString
    return sb.toString();
  }
}
