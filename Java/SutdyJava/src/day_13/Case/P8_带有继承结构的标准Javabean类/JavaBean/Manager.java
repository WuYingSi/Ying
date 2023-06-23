package day_13.Case.P8_带有继承结构的标准Javabean类.JavaBean;

public class Manager extends Employee {
    private int bonus;
    @Override
    public void work(){
        System.out.println("工作--管理其他人");
    }

    public Manager() {
    }

    public Manager(String id, String name, int salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
