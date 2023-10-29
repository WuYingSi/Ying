package Study.Javabean;

public class User {
    private String id;// 编号/身份证号码
    private String name; // 用户名
    private String password;// 密码
    private String phone; // 手机号码
    private String email; // 邮箱
    private String gender; // 性别
    private int age; // 年龄
    public User() {
    }
    // day 11 P4_添加用户对象并判断是否存在
    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    // day 12 P1-2_学生管理系统
    public User(String id, String name, String password, String phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }
    // day 08 GirlFriend
    public User(String name, String password, String email, String gender, int age) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
