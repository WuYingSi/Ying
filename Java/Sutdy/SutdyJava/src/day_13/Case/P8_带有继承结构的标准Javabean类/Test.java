package day_13.Case.P8_带有继承结构的标准Javabean类;

import day_13.Case.P8_带有继承结构的标准Javabean类.JavaBean.Chef;
import day_13.Case.P8_带有继承结构的标准Javabean类.JavaBean.Manager;

public class Test {
    /*
    * 1.经理
    * 成员变量:工号，姓名，工资，管理奖金
    * 成员方法:工作(管理其他人)，吃饭(吃米饭)
    * 2.厨师
    * 成员变量:工号，姓名，工资
    * 成员方法:工作(炒菜)，吃饭(吃米饭)
    * */
    public static void main(String[] args) {
        // 创建经理对象
        Manager m =new Manager("10086","小英",10000,500000);
        System.out.println(m.getId()+", "+m.getName()+", "+m.getSalary()+", "+m.getBonus());
        m.work();
        m.eat();
        System.out.println("--------------------------------------------------------");
        // 创建厨师对象
        Chef c =new Chef("10087","小吴",3000);
        System.out.println(c.getId()+", "+c.getName()+", "+c.getSalary());
        c.work();
        c.eat();
    }
}
