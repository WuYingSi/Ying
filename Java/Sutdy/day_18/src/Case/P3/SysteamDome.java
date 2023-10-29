package Case.P3;

public class SysteamDome {
    public static void main(String[] args) {
        /*
        public static void exit (int status)      终止当前运行的Java虚拟机
        public static long currentTimeMillis ()          返回当前系统的时间毫秒值形式
        public static void arraycopy (数据源数组，起始索引，目的地数组，起始索引，拷贝个数)   数组拷贝
         */

        // public static long currentTimeMillis ()          返回当前系统的时间毫秒值形式
        /*// 获取当前时间所对应的毫秒值
        long millis = System.currentTimeMillis();
        // 输出结果
        System.out.println("当前时间所对应的毫秒值为：" + millis);
        *//*
        * 获取到当前时间的毫秒值的意义：
        * 我们常常来需要统计某一段代码的执行时间。此时我们就可以在执行这段代码之前获取一次时间，在执行完毕以后再次获取一次系统时间，然后计算两个时间的差值，
        * */


        // public static void exit (int status)      终止当前运行的Java虚拟机
        /*// 输出
        System.out.println("程序开始执行了.....");
        // 终止JVM
        System.exit(0);
        // 输出
        System.out.println("程序终止了..........");
        //此时可以看到在控制台只输出了"程序开始了..."，由于JVM终止了，因此输出"程序终止了..."这段代码没有被执行。*/


        // public static void arraycopy (数据源数组，起始索引，目的地数组，起始索引，拷贝个数)   数组拷贝
      /*  // 定义源数组
        int[] srcArray = {23 , 45 , 67 , 89 , 14 , 56 } ;

        // 定义目标数组
        int[] desArray = new int[10] ;

        // 进行数组元素的copy: 把srcArray数组中从0索引开始的3个元素，从desArray数组中的1索引开始复制过去
        System.arraycopy(srcArray , 0 , desArray , 1 , 3);

        // 遍历目标数组
        for(int x = 0 ; x < desArray.length ; x++) {
            if(x != desArray.length - 1) {
                System.out.print(desArray[x] + ", ");
            }else {
                System.out.println(desArray[x]);
            }
        }*/
    }
}
