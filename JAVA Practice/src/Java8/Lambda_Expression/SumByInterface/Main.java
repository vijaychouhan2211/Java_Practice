package Java8.Lambda_Expression.SumByInterface;

public class Main {
    public static void main(String[] args) {
        SumInter sumInter = (int a, int b) -> a+b ;
        System.out.println(sumInter.sum(2,5));
        System.out.println(sumInter.sum(2,10));
    }
}
