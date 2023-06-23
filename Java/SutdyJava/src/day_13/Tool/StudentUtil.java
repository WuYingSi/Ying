package Study.Day.day_13.Tool;

import Study.Day.day_13.Javabean.Student;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {}
    // 获取集合中最大学生的年龄
    public static int getStudentMaxAge(ArrayList<Student> list){
        // 结果
        int maxResult=list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            // 判断的值
            int tempAge=list.get(i).getAge();// 减少方法的反复调用
            // 判断大小
            if (tempAge>maxResult){
                maxResult=tempAge;
            }
        }
        return maxResult;
    }
}
