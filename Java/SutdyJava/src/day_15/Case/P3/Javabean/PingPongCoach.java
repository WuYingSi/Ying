package day_15.Case.P3.Javabean;

public class PingPongCoach extends Coach implements English{
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
