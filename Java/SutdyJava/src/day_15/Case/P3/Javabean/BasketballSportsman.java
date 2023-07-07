package day_15.Case.P3.Javabean;

public class BasketballSportsman extends Sportsman{
    public BasketballSportsman() {
    }

    public BasketballSportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学篮球");
    }
}
