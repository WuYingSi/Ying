package day_18.Concept.P2;

public class 自幂数 {
    /*自幂数，一个n位自然数等于自身各个数位上数字的n次幂之和
     * 举例1：三位数  1^3 + 5^3 + 3^3 = 153
     * 举例2：四位数  1^4 + 6^4 + 3^4 + 4^3 = 1634
     *
     * 如果自幂数是：
     * 一位自幂数，也叫做：独身数
     * 三位自幂数：水仙花数  四位自幂数：四叶玫瑰数
     * 五位自幂数：五角星数  六位自幂数：六合数
     * 七位自幂数：北斗七星数  八位自幂数：八仙数
     * 九位自幂数：九九重阳数  十位自幂数：十全十美数
     *
     * 要求1：统计一共有多少个水仙花数。
     * 要求2：（课后作业）证明没有两位的自幂数。
     * 要求3：（课后作业）分别统计有多少个四叶玫瑰数和五角星数。（答案：都是3个）
     */
    public static void main(String[] args) {
        //水仙花数:100 ~ 999
        int count = 0;
//得到每一个三位数
        for (int i = 100; i <= 999; i++) {
            //个位 十位 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            //判断:
            //每一位的三次方之和 跟本身 进行比较。
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("--------------------------------");
        System.out.println(count);
    }
}
