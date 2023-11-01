package P9;

public class RegexDemo03 {
    // 逻辑运算符
    public static void main(String[] args) {
        // \ 转义字符 改变后面那个字符原本的含义
        //练习:以字符串的形式打印一个双引号
        //"在Java中表示字符串的开头或者结尾

        //此时\表示转义字符，改变了后面那个双引号原本的含义
        //把他变成了一个普普通通的双引号而已。
        System.out.println("\"");

        // \表示转义字符
        //两个\的理解方式：前面的\是一个转义字符，改变了后面\原本的含义，把他变成一个普普通通的\而已。
        System.out.println("c:Users\\moon\\IdeaProjects\\basic-code\\myapi\\src\\com\\itheima\\a08regexdemo\\RegexDemo1.java");
        String str = "had";

        //1.要求字符串是小写辅音字符开头，后跟ad
        String regex = "[a-z&&[^aeiou]]ad";
        System.out.println("1." + str.matches(regex));

        //2.要求字符串是aeiou中的某个字符开头，后跟ad
        regex = "[a|e|i|o|u]ad";//这种写法相当于：regex = "[aeiou]ad";
        System.out.println("2." + str.matches(regex));
    }
}
