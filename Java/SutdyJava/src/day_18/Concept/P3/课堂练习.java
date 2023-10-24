package day_18.Concept.P3;

public class 课堂练习 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2=new int[10];
        // 课堂练习1
        /*// arr2: 0 0 0 0 1 2 3 0 0 0
        System.arraycopy(arr1,0,arr2,4,3);
        // 遍历目标数组
        for(int x = 0 ; x < arr2.length ; x++) {
            if(x != arr2.length - 1) {
                System.out.print(arr2[x] + ", ");
            }else {
                System.out.println(arr2[x]);
            }
        }*/
        System.out.println("--------------------------------");
        // 课堂练习2
        // arr2: 0 0 7 8 9 0 0 0 0 0
        System.arraycopy(arr1,6,arr2,2,3);
        // 遍历目标数组
        for(int x = 0 ; x < arr2.length ; x++) {
            if(x != arr2.length - 1) {
                System.out.print(arr2[x] + ", ");
            }else {
                System.out.println(arr2[x]);
            }
        }
    }
}
