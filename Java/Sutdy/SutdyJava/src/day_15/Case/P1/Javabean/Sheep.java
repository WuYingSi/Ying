package day_15.Case.P1.Javabean;

public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "吃草");
    }
}
