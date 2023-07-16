package day_15.Concept.P7.成员内部类.调用方式2;

public class Outer {
    String name;
    private class Inner{
        static int a = 10;
    }
    public Inner getInstance(){
        return new Inner();
    }
}
