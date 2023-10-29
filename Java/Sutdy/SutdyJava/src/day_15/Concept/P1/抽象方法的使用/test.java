package day_15.Concept.P1.抽象方法的使用;

public class test {
    public static void main(String[] args) {
        // 创建抽象类,抽象类不能创建对象
        // 假设抽象类让我们创建对象,里面的抽象方法没有方法体,无法执行.所以不让我们创建对象
//		Employee e = new Employee();
//		e.work();

        // 3.创建子类
        Manager m = new Manager();
        m.work();

        Cook c = new Cook("ap002", "库克", 1);
        c.work();
    }
}

// 父类,抽象类
abstract class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // 抽象方法
    // 抽象方法必须要放在抽象类中
    abstract public void work();
}

// 定义一个子类继承抽象类
class Manager extends Employee {
    public Manager() {
    }

    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }

    // 2.重写父类的抽象方法
    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}

// 定义一个子类继承抽象类
class Cook extends Employee {
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师炒菜多加点盐...");
    }
}