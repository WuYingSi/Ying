import java.util.Scanner;
public class ying{
	public static void main(String[] args) {
		//定义变量练习
			/*String name =  "吴英思";
			int age = 18;
			char gender = '男';
			double height = 180.1;
			boolean flag = true; 
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			System.out.println(height);
			System.out.println(flag);*/
		
		//键盘录入
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个数字");
			int i = sc.nextInt();
			
			System.out.println("请输入另一个数字");
			int a = sc.nextInt();
			System.out.println(i+a);

	}
} 
