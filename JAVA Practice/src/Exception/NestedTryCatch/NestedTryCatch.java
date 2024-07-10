package Exception.NestedTryCatch;
import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args)throws Exception {
       int marks[] = new int[3] ;
       marks[0] = 1;
       marks[1] = 2;
       marks[2] = 3;
       Scanner sc = new Scanner(System.in);
       boolean flag = true;
       while(flag) {
           System.out.print("Enter the Index Number: ");
           int num = sc.nextInt();
           try {
               try {
                   System.out.println("Value is: " + marks[num]);
                   flag = false;
               } catch (ArrayIndexOutOfBoundsException e) {
                   System.out.println("Array Index Does Not Exist");
               }
           } catch (Exception e) {
               System.out.println("Exception Occured");
           }
       }
        System.out.println("Exiting Program");
    }
}

