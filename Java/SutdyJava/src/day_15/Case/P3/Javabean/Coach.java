package day_15.Case.P3.Javabean;

public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    // 行为
    // 教
    public abstract void teach();
}
