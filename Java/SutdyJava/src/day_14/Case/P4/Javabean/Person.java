package day_14.Case.P4.Javabean;

public class Person {
    private String name;
    private int age;
    // 喂养宠物狗
    public void keepPet(Dog dog, String something) {
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
        dog.eat(something);
    }
    // 喂养宠物猫
    public void keepPet(Cat cat, String something) {
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的猫");
        cat.eat(something);
    }
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
