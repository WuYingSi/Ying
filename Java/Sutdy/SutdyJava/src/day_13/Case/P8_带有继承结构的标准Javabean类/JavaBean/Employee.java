package day_13.Case.P8_带有继承结构的标准Javabean类.JavaBean;

public class Employee {
    private String id;// 工号
    private String name;// 姓名
    private int salary;// 工资
    public void work(){
        System.out.println("工作");
    }
    public void eat(){
        System.out.println("吃饭--米饭");
    }

    public Employee() {
    }

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
