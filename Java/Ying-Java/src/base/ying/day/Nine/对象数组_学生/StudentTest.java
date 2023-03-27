package base.ying.day.Nine.对象数组_学生;

public class StudentTest {
  /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
  学生的属性：学号，姓名，年龄。
  要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
  要求2：添加完毕之后，遍历所有学生信息。
  要求3：通过id删除学生信息 如果存在，则删除，如果不存在，则提示删除失败。
  要求4：删除完毕之后，遍历所有学生信息。
  要求5：查询数组id为“27”的学生，如果存在，则将他的年龄+1岁*/
  public static void main(String[] args) {
    // 数组：存放学生对象
    Student[] arr = new Student[3];
    // 创建学生对象
    Student stu1 = new Student(25, "小英", 20);
    Student stu2 = new Student(26, "小吴", 21);
    Student stu3 = new Student(27, "小思", 22);
    // 把学生对象存放进数组中
    arr[0] = stu1;
    arr[1] = stu2;
    arr[2] = stu3;
    // 要求1
    Student stu4 = new Student(6, "小雯", 26);
    // 学号id唯一性判断
    boolean flag = contains(arr, stu4.getId());
    if (flag) {
      // id已存在
      System.out.println("当前id已存在，请重新赋予id");
    } else {
      // id不存在--添加进对象数组
      // 判断对象数组是否已存满
      int count = getCount(arr); // 数组内的对象的数量
      if (count == arr.length) {
        // 数组已经存满
        // 新的对象数组
        Student[] newArr = creatNewArr(arr);
        newArr[count] = stu4;
        // 遍历所有学生信息
        printf(newArr);
      } else {
        // 数组还未存满
        arr[count] = stu4;
        // arr[count] count表示的是索引
        // 遍历所有学生信息
        printf(arr);
      }
    }
    // 要求3 通过id删除学生信息 如果存在，则删除，如果不存在，则提示删除失败
    // id在数组中的索引
    int index1 = getIndex(arr, 26);
    if (index1 >= 0) {
      // id在数组内存在--删除
      arr[index1] = null;
      // 要求4 遍历数组
      System.out.println();
      printf(arr);
    } else {
      // id在数组内不存在--提示删除失败
      System.out.println("当前id不存在，删除失败");
    }
    //查询数组id为“27”的学生，如果存在，则将他的年龄+1岁
    int index2 = getIndex(arr, 27);
    if (index2>=0){
      // 存在
      Student stu = arr[index2];
      int age = stu.getAge();
      int newAge =age+1;
      stu.setAge(newAge);
      // 遍历
      System.out.println();
      printf(arr);
    }else {
      System.out.println("id不存在");
    }
  }

  // 方法：寻找该id在数组中的对应索引
  public static int getIndex(Student[] arr, int id) {
    for (int i = 0; i < arr.length; i++) {
      Student stu = arr[i]; // 每一个学生对象
      // 非空判断
      if (stu != null) {
        int sid = stu.getId();
        if (sid == id) { // 判断id是否存在
          return i; // 返回该id的索引
        }
      }
    }
    return -1;
  }

  // 方法：用于遍历数组
  public static void printf(Student[] arr) {
    for (int i = 0; i < arr.length; i++) {
      Student stu = arr[i];
      // 非空判断
      if (stu != null) {
        System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
      }
    }
  }

  // 方法：创建一个新的对象数组，长度为旧数组+1
  public static Student[] creatNewArr(Student[] arr) {
    // 创建新对象数组
    Student[] newArr = new Student[arr.length + 1];
    // 旧数组中的对象元素存放进新数组
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    return newArr;
  }

  // 方法：对象数组内存几个对象
  public static int getCount(Student[] arr) {
    // 判断条件：查看对象数组内有多少个初始值null
    // 变量count：统计多少个对象
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != null) {
        // 数组内有一个对象
        count++;
      }
    }
    return count;
  }

  // 方法：在添加的时候进行学号的唯一性判断
  public static boolean contains(Student[] arr, int id) {
    for (int i = 0; i < arr.length; i++) {
      // 获取数组内的学生对象
      Student stu = arr[i];
      // 非空判断
      if (stu != null) {
        // 获取对象的id
        int sid = stu.getId();
        // 比较
        if (sid == id) {
          return true;
        }
      }
    }
    return false;
  }
}
