package day_13.Case.P7_利用方法的重写设计继承结构;

import day_13.Case.P7_利用方法的重写设计继承结构.JavaBean.ChineseDog;
import day_13.Case.P7_利用方法的重写设计继承结构.JavaBean.Husky;
import day_13.Case.P7_利用方法的重写设计继承结构.JavaBean.sharPei;

public class DogTest {
    /*
    * 现在有三种动物:哈士奇、沙皮狗、中华田园犬
    * 暂时不考虑属性，只要考虑行为
    * 请按照继承的思想特点进行继承体系的设计
    * 三种动物分别有以下的行为
    * 哈士奇:吃饭(吃狗粮)、喝水、看家、拆家
    * 沙皮狗:吃饭(吃狗粮、吃骨头)、喝水、看家
    * 中华田园犬:吃饭 (吃剩饭)、喝水、看家
    * */
    public static void main(String[] args) {
        // 创建哈士奇对象
        Husky h=new Husky();
        System.out.println("哈士奇");
        h.eat();
        h.drink();
        h.breakHome();
        h.lookHome();
        // 创建沙皮狗对象
        sharPei s = new sharPei();
        System.out.println("沙皮狗");
        s.eat();
        s.drink();
        s.lookHome();
        // 创建中华田园犬对象
        ChineseDog c=new ChineseDog();
        System.out.println("中华田园犬");
        c.eat();
        c.drink();
        c.lookHome();
    }
}
