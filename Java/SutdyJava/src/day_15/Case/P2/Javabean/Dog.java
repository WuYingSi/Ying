package day_15.Case.P2.Javabean;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"吃骨头");
    }

    @Override
    public void swim() {
        System.out.println(getName()+"狗刨");
    }
}
