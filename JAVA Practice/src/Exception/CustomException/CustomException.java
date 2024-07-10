package Exception.CustomException;
//Custom Checked Exception
class MyCheckedException extends Exception {
    public String getMessage;

    public MyCheckedException(String s) {
        super("MY CHECKED EXCEPTION");
    }
}
//Custom Unchecked Exception
class MyUncheckedException extends RuntimeException{
    public String getMessage;

    public MyUncheckedException(String s) {
        super(s);
    }
}
public class CustomException {
    public static void main(String[] args) {
        try {
            throw new MyCheckedException("\nThrow Checked Exception.....");//throw is used when the user create Exception
        }
        catch (MyCheckedException e) {
            System.out.println("Caught Checked Exception... " + e.getMessage());
        }
        try {
            throw new MyUncheckedException("\nThrow Unchecked Exception....");
        }
        catch (MyUncheckedException e) {
            System.out.println("Caught Unchecked Exception..." + e.getMessage());
        }
    }
}
