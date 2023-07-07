package day_15.Case.P1.Javabean;

public class Frog extends Animal {
    public Frog() {
    }
    public Frog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(getName()+"吃虫子");
    }

}
