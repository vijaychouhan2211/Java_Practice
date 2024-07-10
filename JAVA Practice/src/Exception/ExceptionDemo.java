package Exception;
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println(8/0);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
