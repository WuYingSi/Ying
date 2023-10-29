package day_15.Concept.P3.类与接口的多实现;

/**
 * Java中接口是可以被多实现的：
 *    一个类可以实现多个接口: Law, SportMan
 * */
public class JumpMan implements Law ,SportMan {
    @Override
    public void rule() {
        System.out.println("尊长守法");
    }

    @Override
    public void run() {
        System.out.println("训练跑步！");
    }
}
