package Study.Day.day_11.案例;

import Study.Javabean.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class P3_添加学生对象并遍历 {
    public static void main(String[] args) {
        // 需求:定义一个集合，添加一些学生对象，并进行遍历
        // 学生类的属性为:姓名，年龄。
        // 要求对象的数据来自键盘录入
        ArrayList<Student> list = new ArrayList<>();
//        list.add(new Student("张三", 18));
//        list.add(new Student("李四", 19));
//        list.add(new Student("王五", 20));
//        list.add(new Student("赵六", 21));
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入要添加的学生姓名");
            String name = scanner.next();
            System.out.println("请输入要添加的学生年龄");
            int age = scanner.nextInt();
            list.add(new Student(name, age));
        }

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
        }
    }
}
