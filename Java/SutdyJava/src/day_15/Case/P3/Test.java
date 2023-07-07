package day_15.Case.P3;

import day_15.Case.P3.Javabean.BasketballCoach;
import day_15.Case.P3.Javabean.BasketballSportsman;
import day_15.Case.P3.Javabean.PingPongCoach;
import day_15.Case.P3.Javabean.PingPongSportsman;

public class Test {
    public static void main(String[] args) {
        // 创建教练
        // 篮球
        BasketballCoach bc=new BasketballCoach("小米",26);
        // 乒乓球
        PingPongCoach pc=new PingPongCoach("小王",28);
        // 创建运动员
        // 篮球
        BasketballSportsman bs=new BasketballSportsman("小张",25);
        // 乒乓球
        PingPongSportsman ps=new PingPongSportsman("小明",27);
        System.out.println(bc.getName()+", "+bc.getAge());
        bc.teach();
        System.out.println(pc.getName()+", "+pc.getAge());
        pc.teach();
        pc.speak();
        System.out.println("_____________________________");
        System.out.println(bs.getName()+", "+bs.getAge());
        bs.study();
        System.out.println(ps.getName()+", "+ps.getAge());
        ps.study();
        ps.speak();
    }
}
