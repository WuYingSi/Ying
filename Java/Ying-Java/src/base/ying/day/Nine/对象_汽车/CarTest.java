package base.ying.day.Nine.对象_汽车;

import java.util.Scanner;

public class CarTest {
  public static void main(String[] args) {
    // 数组：存放汽车对象
    Car[] arr = new Car[3];
    // 键盘录入，创建对象：三部汽车
    Scanner sb = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      // 创建对象：汽车
      Car c = new Car();
      // 品牌
      System.out.println("请输入汽车的品牌");
      String brand = sb.next();
      c.setBrand(brand);
      // 价格
      System.out.println("请输入汽车的价格");
      int price = sb.nextInt();
      c.setPrice(price);
      // 颜色
      System.out.println("请输入汽车的颜色");
      String color = sb.next();
      c.setColor(color);
      // 将对象存放到数组中
      arr[i] = c;
    }
    // 遍历
    for (int i = 0; i < arr.length; i++) {
      Car car=arr[i];
      System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
    }
  }
}
