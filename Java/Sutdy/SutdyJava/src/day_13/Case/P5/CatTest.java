package day_13.Case.P5;

import day_13.Case.P5.JavaBean.Husky;
import day_13.Case.P5.JavaBean.Ragdoll;

public class CatTest {
    public static void main(String[] args) {
        // 创建布偶猫对象
        Ragdoll rd=new Ragdoll();
        rd.catchMouse();// 父类Cat
        rd.eat();// 父类Animal

        // 创建哈士奇对象
        Husky hs=new Husky();
        hs.breakHome();// 自己的方法
        hs.lookHome();// 父类Dog
        hs.drink();// 父类Animal
    }
}
