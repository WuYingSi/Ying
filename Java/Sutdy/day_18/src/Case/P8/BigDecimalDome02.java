package Case.P8;

import java.math.BigDecimal;

public class BigDecimalDome02 {
    public static void main(String[] args) {
        /*
        public BigDecimal add(BigDecimal value)				// 加法运算
        public BigDecimal subtract(BigDecimal value)		// 减法运算
        public BigDecimal multiply(BigDecimal value)		// 乘法运算
        public BigDecimal divide(BigDecimal value)			// 除法运算
        */

        // 创建两个BigDecimal对象
        BigDecimal b1 = new BigDecimal("0.3") ;
        BigDecimal b2 = new BigDecimal("4") ;

        // 调用方法进行b1和b2的四则运算，并将其运算结果在控制台进行输出
        System.out.println(b1.add(b2));         // 进行加法运算
        System.out.println(b1.subtract(b2));    // 进行减法运算
        System.out.println(b1.multiply(b2));    // 进行乘法运算
        System.out.println(b1.divide(b2));      // 进行除法运算

    }
}
