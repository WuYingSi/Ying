public class test {
    public static void main(String[] args) {
        for (int i = 1; i ++<=5; ) {

            // 新嵌套 每列的*#
            for (int j = 0; j++<5; ) {
                if((i+j)%2!=0){
                    System.out.print("傻逼林楚\t");
                }else{
                    System.out.print("林楚傻逼\t");
                }
            }
            System.out.println();// 换行

        }
    }
}
