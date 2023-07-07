package day_15.Concept.P3.类与接口基本实现案例.Javabean;

import day_15.Concept.P3.类与接口基本实现案例.Javabean.PingPongMan;

public class test {
    public static void main(String[] args) {
        // 创建实现类对象。
        PingPongMan zjk = new PingPongMan();
        zjk.run();
        zjk.law();
        System.out.println(zjk.compittion("全球乒乓球比赛"));

    }
}
