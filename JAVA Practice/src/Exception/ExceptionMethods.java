package Exception;
public class ExceptionMethods  {
    public static void main(String[] args) {
        int a = 9;
           try {
               a = a / 0;
               System.out.println(a);
           }
           catch (ArithmeticException e) {
               System.out.println("Stack-Trace: " + e.getStackTrace()); //print Exception Name, the Description of the Exception and the Stack-trace
               System.out.println("To String Method: " + e.toString()); //print Exception Name and the Description of the Exception
               System.out.println("Get Message: " + e.getMessage()); //only print the Description of the Exception
               Throwable cause = e.getCause();
               if (cause != null) {
                   System.out.println(" cause: "+cause.getMessage());
               }
           }
    }
}
