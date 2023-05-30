package Study.Day.day_12;

import Study.Javabean.User;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class 学生管理系统 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 集合：用户信息存放
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("444444444444444444", "xiaoying", "123456", "12345678910"));
        // 首页
        System.out.println("\t\t欢迎来到学生管理系统");
        System.out.println("请选择操作\t1登录\t2注册\t3忘记密码");
        // 选择方法
        String choose = sc.next();
        switch (choose) {
            case "1" -> login(list);
            case "2" -> {
                User newUser = register(list);
                list.add(newUser);
                System.out.println("用户" + newUser.getName() + "注册成功");
            }
            case "3" -> forgotPassword(list);
            case "4" -> {
                System.out.println("已退出系统");
                System.exit(0);
            }
            default -> System.out.println("输入错误");
        }
    }


    // 登录
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        System.out.println("请输入验证码（" + getVerifyCode() + "）：");
        System.out.println("用户" + username + "登录成功");

    }

    // 随机获取五位数的验证码
    private static String getVerifyCode() {
        // 思路：
        /*
         *   for循环五次，即验证码五位数
         *   给定一个大写字母和小写字母的集合、数字的集合
         *   前四位每一位从存放大写字母和小写字母的集合内随机抽取一位放到验证码字符串内
         *   最后一位从数字的集合内随机抽取一位随机和前四位的其中之一调换位置
         * */
        // 长度为5
        StringBuilder verifyCode = new StringBuilder();// 验证码
        Random r = new Random();
        // 由4位大写或者小写字母和1位数字组成，同一个字母可重复
        // 集合：存放大写字母小写字母
        ArrayList<Character> letter = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            letter.add((char) ('A' + i));// 把添加内容强转换成字符
            letter.add((char) ('a' + i));// 把添加内容强转换成字符
        }
        // 随机抽取四个字母存放进验证码内
        for (int i = 0; i < 4; i++) {
            verifyCode.append(letter.get(r.nextInt(letter.size() + 1)));
        }
        // 数字可以出现在任意位置
        int number = r.nextInt(10);// 随机取0~9
        verifyCode.append(number);
        // 先把verifyCode转换位字符串再转换为字符数组
        char[] arr = verifyCode.toString().toCharArray();
        // 把最后一位数字于前面随机索引进行调换
        int index = r.nextInt(arr.length + 1);// 随机数0~5
        // 数值进行交换
        char temp = arr[index];
        arr[index] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        // 创建一个新的字符串
        return new String(arr);
    }

    // 注册
    public static User register(ArrayList<User> list) {
        // 先验证格式是否正确，再验证是否唯一
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        String personID;
        String phone;
        // 用户名
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();
            // 验证用户名格式是否正确
            boolean flag_1 = checkUsername(username);
            // 格式结果进行判断
            if (!flag_1) {
                System.out.println("格式错误，请重新输入");
                continue;
            }
            // 判断用户名是否唯一
            boolean flag_2 = contains(list, username);
            if (flag_2) {
                System.out.println("用户名" + username + "已存在，请重新输入");
            } else {
                // 用户名可使用
                break;
            }
        }
        // 密码
        while (true) {
            System.out.println("请输入密码");
            password = sc.next();
            System.out.println("请再次输入密码");
            String repassword = sc.next();
            // 密码格式判断
            // 密码键盘输入两次，两次一致才可以进行注册
            if (!password.equals(repassword)) {
                System.out.println("两次输入的密码不一致，请重新输入");
            } else {
                break;
            }
        }
        // 身份证号码
        while (true) {
            System.out.println("请输入身份证号码");
            personID = sc.next();
            // 验证身份证号码格式是否正确
            boolean flag = checkPersonID(personID);
            // 格式结果进行判断
            if (flag) {
                break;
            }
        }
        // 手机号码
        while (true) {
            System.out.println("请输入手机号码");
            phone = sc.next();
            // 验证身份证号码格式是否正确
            boolean flag = checkPhone(phone);
            // 格式结果进行判断
            if (flag) {
                break;
            }
        }
        // 把用户信息存放进用户对象内，并返回
        return new User(personID, username, password, phone);
    }

    // 用户名方法：验证格式是否正确
    public static boolean checkUsername(String username) {
        // 用户名长度必须在3~15位之间
        int len = username.length();
        if (len < 3 || len > 15) {
            // 格式错误返回true;
            return false;
        }
        // 用户名只能是字母加数字的组合
        // 循环：获取字符串里的每一个字符
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);// 获取字符串里的每一个字符
            // if判断：!((小写字母)||(大写字母)||(数字))：!取反，即表示c没在这三个范围内
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                // 不符合格式
                return false;
            }
        }
        // 用户名不能是纯数字
        // 统计在用户名中又多少字母
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);// 获取字符串里的每一个字符
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
                // 运行到这里count++时，已经证明用户名已经包含一个字母了，不是纯数字，直接跳出循环
            }
        }
        // 当count等于0时证明用户名是纯数字，没有包含一个字母
        return count > 0;
    }

    // 用户名方法：验证用户名的唯一性
    public static boolean contains(ArrayList<User> list, String uname) {
//        // 判断id唯一性
//        for (int i = 0; i < list.size(); i++) {
//            Student st = list.get(i);// 获取集合内的每个学生信息
//            if (st.getId().equals(id)) {
//                return true;
//            }
//        }
//        return false;
        // 调用查找索引的结果来判断id是否存在
        return getIndex(list, uname) >= 0;
    }

    // 方法：根据id查找对应的用户信息 返回索引
    public static int getIndex(ArrayList<User> list, String uname) {
        // 循环遍历获得集合里每一个对象
        for (int i = 0; i < list.size(); i++) {
            // 判断对象的id是否与传入的id相同
            if (list.get(i).getName().equals(uname)) {
                return i;
            }
        }
        return -1;
    }

    // 身份证方法：验证格式是否正确
    private static boolean checkPersonID(String personID) {
        // 长度为18位
        if (personID.length() != 18) {
            System.out.println("身份证号码格式错误：长度不符合要求，请重新输入");
            return false;
        }
        // 不能以0为开头
/*
        if (personID.startsWith("0")) {
            System.out.println("身份证号码不能以0开头，请重新输入");
            return false;
        }
*/
        if (personID.charAt(0) == '0') {
            System.out.println("身份证号码格式错误：不能以0开头，请重新输入");
            return false;
        }
        // 前17位，必须都是数字
        for (int i = 0; i < personID.length() - 1; i++) {
            char c = personID.charAt(i);// 获取前十七位每一个字符
            // 是否为数字
            if (!(c >= '0' && c <= '9')) {
                System.out.println("身份证号码格式错误：前十七位不为数字，请重新输入");
                return false;
            }
        }
        // 最后一位可以是数字，也可以是大写X或小写x
        char end = personID.charAt(personID.length() - 1);// 获取最后一位字符
        if (!((end >= '0' && end <= '9') || (end == 'x') || (end == 'X'))) {
            System.out.println("身份证号码格式错误：最后一位数出错，只能是数字或者X或者x");
            return false;
        }
        // 所有条件满足
        return true;
    }

    // 手机号码方法：验证格式是否正确
    private static boolean checkPhone(String phone) {
        // 长度为11位
        if (phone.length() != 11) {
            System.out.println("手机号码格式错误：长度不符合要求，请重新输入");
            return false;
        }
        // 不能以0为开头
        if (phone.startsWith("0")) {
            System.out.println("手机号码格式错误：不能以0开头，请重新输入");
            return false;
        }
        // 必须都是数字
        for (int i = 0; i < phone.length(); i++) {
            char c = phone.charAt(i);// 获取每一个字符
            // 是否为数字
            if (!(c >= '0' && c <= '9')) {
                System.out.println("手机号码格式错误：号码不为数字，请重新输入");
                return false;
            }
        }
        // 满足要求
        return true;
    }

    // 忘记密码
    public static void forgotPassword(ArrayList<User> list) {
    }


}
