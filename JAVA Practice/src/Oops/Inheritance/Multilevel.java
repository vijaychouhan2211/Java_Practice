package Oops.Inheritance;

//Multilevel Inheritance
class Employee {
    String name;
    int emp_ID;
    String hire_date;

    public Employee(String name, int emp_ID, String hire_date) {
        this.name = name;
        this.emp_ID = emp_ID;
        this.hire_date = hire_date;
    }
    public void printData() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + emp_ID);
        System.out.println("Hire Date: " + hire_date);
    }
}
class WorkTime extends Employee {
    int num_hours;

    public WorkTime(String name, int emp_ID, String hire_date,int num_hours) {
        super(name, emp_ID, hire_date);
        this.num_hours = num_hours;
    }
    @Override
    public void printData() {
        super.printData();
        System.out.println("Number of Hours Worked: " + num_hours);
    }
}
class Branch extends WorkTime  {
    String branch_name;

    public Branch(String name, int emp_ID, String hire_date,int num_hours, String branch_name){
        super(name, emp_ID, hire_date, num_hours);
        this.branch_name = branch_name;
    }
    @Override
    public void printData(){
        super.printData();
        System.out.println("Working in Branch: " + branch_name);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        WorkTime workTime = new WorkTime("Ravan", 420, "05-06-2026", 10);
        Branch branch = new Branch("Ravan", 420, "05-06-2026", 10, "Web Development");
        System.out.println("\n---------Employee Information----------");
        workTime.printData();
        System.out.println("\n\n Employee Information:");
        branch.printData();
    }
}