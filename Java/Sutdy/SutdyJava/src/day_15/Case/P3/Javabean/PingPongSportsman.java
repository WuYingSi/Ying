package day_15.Case.P3.Javabean;

public class PingPongSportsman extends Sportsman implements English {
    public PingPongSportsman() {
    }

    public PingPongSportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
