package day_15.Case.P3.Javabean;

public abstract class Sportsman extends Person {
    public Sportsman() {
    }

    public Sportsman(String name, int age) {
        super(name, age);
    }

    // 行为
    // 学
    public abstract void study();
}
