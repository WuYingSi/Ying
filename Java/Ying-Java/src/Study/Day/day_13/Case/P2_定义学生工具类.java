package Study.Day.day_13.Case;

import Study.Day.day_13.Javabean.Student;
import Study.Day.day_13.Tool.StudentUtil;

import java.util.ArrayList;

public class P2_定义学生工具类 {
    /*
     *   定义学生工具类
     *   需求:定义一个集合，用于存储3个学生对象。
     *   学生类的属性为:name、age、gender
     *   定义一个工具类，用于获取集合中最大学生的年龄
     * */
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("xiaowu", 16, "男"));
        list.add(new Student("xiaoying", 17, "男"));
        list.add(new Student("xiasi", 18, "女"));
        int maxAge= StudentUtil.getStudentMaxAge(list);
        System.out.println(maxAge);
    }
}
