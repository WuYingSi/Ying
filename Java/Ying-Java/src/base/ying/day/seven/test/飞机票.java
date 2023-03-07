package base.ying.day.seven.test;

import java.util.Scanner;

public class 飞机票 {
    public static void main(String[] args){
        plane();
    }
    //题目 卖飞机票
    //机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
    //按照如下规则计算机票价格：
    //旺季（5-10月）头等舱9折，经济舱8.5折，
    //淡季（11月到来年4月）头等舱7折，经济舱6.5折。
  public static void plane() {
      Scanner sc = new Scanner(System.in);
    // 输入机票原价
      System.out.println("请输入机票原价");
      int price = sc.nextInt();
    // 输入月份
      System.out.println("请输入月份");
      int month = sc.nextInt();
    // 头等舱或者经济舱
    System.out.println("请输入是否为头等舱或者经济舱（1或者0）");
    int data = sc.nextInt();
    //最终价格
      double priceOne = 0;
    switch (month){
      case 5,6,7,8,9,10 :{
          price=getPice(price,data,0.9,0.85);
        break;
        }
        case 11,12,1,2,3,4:{
            price=getPice(price,data,0.7,0.65);
            break;
        }
      }
      System.out.println("最终价格为" + price);
  }
  //方法：得出最终价格
  public static int getPice(int price, int data,double v0,double v1){
      if(data == 1){
          price = (int)(price*v0);
      }else if (data == 0){
          price = (int)(price*v1);
      }
       return price;
  }
}
