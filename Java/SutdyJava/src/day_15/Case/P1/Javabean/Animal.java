package day_15.Case.P1.Javabean;

public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 行为
    // 喝
    public void drink() {
        System.out.println(getName() + "在喝水");
    }
    // 吃
    public abstract void eat();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
