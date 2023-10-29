package day_15.Concept.P3.类与接口基本实现;

public class PingPongMan implements SportMan {
    /* *
     * 接口的实现：
     *    在Java中接口是被实现的，实现接口的类称为实现类。
     *    实现类的格式:
     *      class 类名 implements 接口1,接口2,接口3...{
     *
     *
     *      }
     * */
    @Override
    public void run() {
        System.out.println("乒乓球运动员稍微跑一下！！");
    }

    @Override
    public void law() {
        System.out.println("乒乓球运动员守法！");
    }

    @Override
    public String compittion(String project) {
        return "参加" + project + "得金牌！";
    }
}
