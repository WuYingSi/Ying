package day_13.Case.P7_利用方法的重写设计继承结构.JavaBean;

public class sharPei extends Dog {
    @Override
    public void eat(){
        System.out.println("吃饭（吃狗粮、吃骨头）");
    }
}
