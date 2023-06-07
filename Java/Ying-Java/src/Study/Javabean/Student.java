package Study.Javabean;

public class Student {
    private String id;//
    private String name;// 姓名
    private int age;// 年龄
    private String address;// 地址
    // day 11 P3_添加学生对象并遍历
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // day 11 P6_学生管理系统
    public Student(String id, String name,int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student() {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
