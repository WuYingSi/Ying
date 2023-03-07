package base.ying;


public class subject {
  public static void main(String[] args) {
    /*System.out.println("我是帅哥");
    //打印
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个数");
    int a = sc.nextInt();
    System.out.println("请输入另一个数");
    int b = sc.nextInt();
    if(a % b == 0){
        System.out.println("整数a被整数b整除");
    }
    else if(a % b != 0){
        System.out.println("整数a不被整数b整除");*/

    /*Scanner sb = new Scanner(System.in);
    System.out.println("请输入自己的时髦度（1到10）");
    int my = sb.nextInt();
    if(my >= 1 && my <= 10){
        System.out.println("请输入相亲对象的时髦度（1到10）");
        int you = sb.nextInt();
        if(you >= 1 && you <= 10){
            if(my > you){
                System.out.println("相亲成功");
            }
            else{
                System.out.println("相亲失败");
            }
        }
        else{
            System.out.println("输入错误");
        }
    }
    else{
        System.out.println("输入错误");
    }*/

    /*Scanner sb = new Scanner(System.in);
    System.out.println("请输入第一个整数");
    int a = sb.nextInt();
    System.out.println("请输入第二个整数");
    int b = sb.nextInt();
    boolean first;
    if((a == 6) || (b == 6) || ((a + b) % 6 == 0)) {
        first = true;
    } else {
        first = false;
    }
    System.out.println("结果：" + first);*/

    /*System.out.println("switch");
    switch (1){
        case 10:
            System.out.println("帅哥");
    }*/

    /*int a = 200;
    byte b = (byte) a;
    System.out.println(b);
    int number2 = 300;
    System.out.println(number2);*/

    // 李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，而手机专卖店推出以旧换新的优惠，
    // 把她的旧手机交给店家，新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？
    /*int newPrice = 7988;
      int oldPrice = 1500;
      if((newPrice * 0.8) > (newPrice - oldPrice)){
          System.out.println("可以以旧换新");
      }
      else {
          System.out.println("不要以旧换新");
      }
    */

    // 让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
    /*Scanner sb = new Scanner(System.in);
     System.out.println("请输入第一个数");
     int number1 = sb.nextInt();
     System.out.println("请输入第二个数");
     int number2 = sb.nextInt();
     System.out.println("请输入第三个数");
     int number3 = sb.nextInt();
     int max = (number1>number2 ? number1 : number2) > number3 ? (number1>number2 ? number1 : number2) : number3;
     System.out.println(max);

    */

    /*某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
    存期		年利率（%）
    一年		2.25
    两年		2.7
    三年		3.25
    五年		3.6
       请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
       提示：
    存入金额和存入年限均由键盘录入
    本息计算方式：本金+本金×年利率×年限
        */
    /*double total = 0;
     Scanner sb = new Scanner (System.in);
     System.out.println("请输入想要存入的金额");
     int amount = sb.nextInt();
     if(amount >= 1000){
         System.out.println("请输入存入的年限");
         int age = sb.nextInt();
         switch (age){
             case 1:
                 total = amount + amount * 2.25 / 100  * age;
                 break;
             case 2:
                 total = amount + amount * 2.7 / 100 * age;
                 break;
             case 3:
                 total = amount + amount * 3.25 / 100 * age;
                 break;
             case 5:
                 total = amount + amount * 3.6 / 100 * age;
                 break;
             default:
                 System.out.println("输入年限错误");
         }
     }else {
         System.out.println("1000起存");
     }
     System.out.println("本息总额：" + total);
    */

    /*  某商场购物可以打折，具体规则如下：
      	普通顾客购不满100元不打折，满100元打9折；
    会员购物不满200元打8折，满200元打7.5折；
    不同打折规则不累加计算。
       请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。
      */
    /*Scanner sb = new Scanner(System.in);
     System.out.println("您是否为会员（0表示普通顾客，1表示会员）");
     int vip = sb.nextInt();
     double total = 0;
     if (vip == 0){
         System.out.println("请输入您的购物总额");
         double price = sb.nextInt();
         if(price >= 100){
             total = price * 0.9;
         }else if (price < 100 && price >= 0){
             total = price;
         }
     }else if (vip == 1){
         System.out.println("请输入您的购物总额");
         double price = sb.nextInt();
         if(price >= 200){
             total = price * 0.75;
         }else if (price < 200 && price >= 0){
             total = price * 0.8;
         }
     }else {
         System.out.println("判断是否为会员错误");
     }
     System.out.println("总价格为" + total);
    */
    //        int sum = 1;
    //        int i = 0;
    //        sum = sum + i;

    //    Scanner sb = new Scanner(System.in);
    //    System.out.println("请输入一个被除数");
    //    int dividend = sb.nextInt();
    //    System.out.println("请输入一个除数");
    //    int divisor = sb.nextInt();
    //    int i = 0;
    //    while (dividend >= divisor) {
    //      dividend = dividend - divisor;
    //      i++;
    //    }
    //    System.out.println("商:" + i);
    //    System.out.println("余:" + dividend);

    // 随机数
    //    Random rd= new Random();
    //    int r = rd.nextInt(100);
    //    for (int i = 1; i < 100; i++) {
    //
    //    }
    //
    //    System.out.println(r);
    //    int arr[] = {1, 2, 3, 4, 5};
    //    for (int i = 0; i <= arr.length; i++) {
    //      System.out.println(arr[i]);
    //    }

//    int arr[] = {33, 5, 22, 44, 55};
//    int max = arr[0];
//    for (int i = 1; i < arr.length; i++) {
//      if (arr[i] > max) {
//        max = arr[i];
//      }
//    }
//    System.out.println(max);

//    需求：生成10个1~100之间的随机数存入数组。
//    1）求出所有数据的和
//    2）求所有数据的平均数
//    3）统计有多少个数据比平均值小
//
//      int arr[]= new int[10];
//    Random r = new Random();
//    for (int i = 0; i < arr.length; i++) {
//      int number = r.nextInt(100)+1;
//      arr[i]=number;
//    }
////    1）求出所有数据的和
//    int sum=0;
//    for (int i = 0; i < arr.length; i++) {
//      sum=sum+arr[i];
//    }
//    System.out.println("所有数据的和："+sum);
//
//    //    2）求所有数据的平均数
//    int average = sum / arr.length;
//    System.out.println("所有数据的平均数："+average);
//    //    3）统计有多少个数据比平均值小
//    int cont = 0;
//    for (int i = 0; i < arr.length; i++) {
//      if (arr[i] > average) {
//        cont++;
//      }
//    }
//    System.out.print(cont + "个数据比平均数小");
//    System.out.print(cont + "个数据比平均数小");
  }

//  public static void ying[]{
//
//  }
}
