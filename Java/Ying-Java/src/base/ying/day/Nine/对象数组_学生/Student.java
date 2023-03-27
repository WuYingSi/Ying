package base.ying.day.Nine.对象数组_学生;

public class Student {
  //属性：学号、姓名、年龄
  private int id; // 学号
  private String name; // 姓名
  private int age; // 年龄
  //空参
  public Student() {
  }
  //全参
  public Student(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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
