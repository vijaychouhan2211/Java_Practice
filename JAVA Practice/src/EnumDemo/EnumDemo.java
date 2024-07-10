package EnumDemo;
//Enum if and Switch
enum Status{
    Failed, Pending, Running, Success;
}       
public class EnumDemo {
    public static void main(String[] args) {
       Status s = null;
        s = s.Running;
        
        System.out.println("By using if else ");
        if( s == s.Failed )
            System.out.println("Failed :(");
       else if( s == s.Pending )
            System.out.println("Pending......");
       else if( s == s.Running )
            System.out.println("Running......");
       else
            System.out.println("Success......");
        
       System.out.println("By using Switch Case ");
       s = s.Failed;
       switch(s) {
           case Failed:
               System.out.println("Failed :(");
               break;
           case Pending:
               System.out.println("Pending.....");
               break;
           case Running:
               System.out.println("Running.....");
               break;
           case Success:
               System.out.println("Sucess.....");
               break;
       }
    }
}
