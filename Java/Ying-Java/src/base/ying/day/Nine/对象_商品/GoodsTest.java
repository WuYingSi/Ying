package base.ying.day.Nine.对象_商品;

/*定义数组存储3个商品对象。
 *商品的属性：商品的id，名字，价格，库存。
 *创建三个商品对象，并把商品对象存入到数组当中。*/
public class GoodsTest {
    public static void main(String[] args){
        //数组：用于存放商品对象
        Goods[] arr=new Goods[3];
        //创建对象
        Goods g1 =new Goods("2","唱",120,100);
        Goods g2 =new Goods("5","跳",150,50);
        Goods g3 =new Goods("0","篮球",250,250);
        //存放进数组
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
    // 遍历数组
    for (int i = 0; i < arr.length; i++) {
      Goods goods=arr[i];
      System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
    }
    }
}
