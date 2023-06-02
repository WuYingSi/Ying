package Study.Day.day_11.案例;

import Study.Javabean.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class P6_学生管理系统 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        // 选择5退出整个while
        // 方式1
//        boolean flag =true;
//        while (flag) {
//            System.out.println("\"----------欢迎来到学生管理系统----------\"");
//            System.out.println("\"1: 添加学生\"");
//            System.out.println("\"2: 删除学生\"");
//            System.out.println("\"3: 修改学生\"");
//            System.out.println("\"4: 查询学生\"");
//            System.out.println("\"5: 退出\"");
//            System.out.println("\"请输入您的选择\"");
//            String ch = sc.next();
//            flag = choose(ch);
//        }
        // 方式2
        list.add(new Student("01", "小英", 18, "广东省"));
        list.add(new Student("02", "小雯", 18, "广东省"));
        list.add(new Student("03", "小李", 18, "广东省"));
        list.add(new Student("04", "小刘", 18, "广东省"));
        loop:
        while (true) {
            System.out.println("\"----------欢迎来到学生管理系统----------\"");
            System.out.println("\"1: 添加学生\"");
            System.out.println("\"2: 删除学生\"");
            System.out.println("\"3: 修改学生\"");
            System.out.println("\"4: 查询学生\"");
            System.out.println("\"5: 退出\"");
            System.out.println("\"请输入您的选择\"");
            String ch = sc.next();
            // switch选择
            switch (ch) {
                case "1" -> {
                    list.add(addStudent(list));
                    System.out.println("添加成功");
                }
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    // System.exit(0);// 停止虚拟机运行
                    break loop;// 跳出定义为loop的循环
                }
                default -> System.out.println("选项错误");
            }
        }

    }

    // 方法：选择进入的操作方法
//    public static boolean choose(String value) {
//        // switch选择
//        switch (value) {
//            case "1" -> addStudent();
//            case "2" -> addStudent();
//            case "3" -> addStudent();
//            case "4" -> addStudent();
//            case "5" -> {
//                return false;
//            }
//            default -> {
//                System.out.println("选项错误");
//            }
//        }
//        return true;
//    }

    // 方法：添加学生
    public static Student addStudent(ArrayList<Student> list) {
        // 待添加的学生信息
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学生id编号：");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("当前输入的学生id编号已具有，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生家庭地址：");
        String address = sc.next();
        // 把输入的学生信息存放进学生对象内，并返回
        return new Student(id, name, age, address);
    }

    // 方法：删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要删除的学生id信息：");
        String id = sc.next();
        // 判断id匹配的学生信息索引
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);// 删除该学生信息匹配的id索引
            // 删除成功提醒
            System.out.println("id为：" + id + "的学生信息已删除");
        } else if (index == -1) {
            System.out.println("学生信息id不存在，无法删除");
        }
    }

    // 方法：修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要修改的学生id信息：");
        String id = sc.next();
        // 判断id匹配的学生信息索引
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("学生信息id不存在，无法修改");
            return;// 直接结束方法，后面代码不做运行
        }
        // 代码运行到这，表示id信息存在
        // 输入要修改的信息
        System.out.println("请输入要修改的学生姓名：");
        String name = sc.next();
        System.out.println("请输入要修改的学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入要修改的学生家庭地址：");
        String address = sc.next();
        // 修改
        Student stu = list.get(index);
        stu.setName(name);
        stu.setAge(age);
        stu.setAddress(address);
        // 修改成功提醒
        System.out.println("id为：" + id + "的学生信息已修改");
    }

    // 方法：查询学生
    public static void queryStudent(ArrayList<Student> list) {
        // 如果没有学生信息，提示：当前无学生信息，请添加后再查询
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;// 结束方法 没有学生信息直接返回
        }
        // 输出学生信息
        System.out.println("id编号\t\t姓名\t\t年龄\t\t家庭地址");
        for (int i = 0; i < list.size(); i++) {
            Student st = list.get(i);
            System.out.println(st.getId() + "\t\t" + st.getName() + "\t\t" + st.getAge() + "\t\t" + st.getAddress());
        }
    }

    // 方法：验证id的唯一性
    public static boolean contains(ArrayList<Student> list, String id) {
//        // 判断id唯一性
//        for (int i = 0; i < list.size(); i++) {
//            Student st = list.get(i);// 获取集合内的每个学生信息
//            if (st.getId().equals(id)) {
//                return true;
//            }
//        }
//        return false;
        // 调用查找索引的结果来判断id是否存在
        return getIndex(list, id) >= 0;
    }

    // 方法：根据id查找对应的用户信息 返回索引
    public static int getIndex(ArrayList<Student> list, String id) {
        // 循环遍历获得集合里每一个对象
        for (int i = 0; i < list.size(); i++) {
            // 判断对象的id是否与传入的id相同
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }

        return -1;
    }
}
