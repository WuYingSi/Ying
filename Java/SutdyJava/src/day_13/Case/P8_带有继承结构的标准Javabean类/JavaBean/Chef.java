package day_13.Case.P8_带有继承结构的标准Javabean类.JavaBean;

public class Chef extends Employee {
    @Override
    public void work(){
        System.out.println("工作--炒菜");
    }

    public Chef(String id, String name, int salary) {
        super(id, name, salary);
    }

    public Chef() {
    }
}
