import java.util.Scanner;

public class Emp {
	int empno;
	String emp_name;
	String emp_desig;
	String dept;
	int salary;
	int doj;
	
	public void readData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		empno=sc.nextInt();
		System.out.println("Enter name");
		emp_name=sc.next();
		System.out.println("Enter desig");
		emp_desig=sc.next();
		System.out.println("Enter dept");
		dept=sc.next();
		System.out.println("Enter salary");
		salary=sc.nextInt();
		System.out.println("Enter doj");
		doj=sc.nextInt();
		
	}
	public void displayData()
	{
		System.out.println("Employee no. is "+empno);
		System.out.println("Employee name is "+emp_name);
		System.out.println("Employee designation is "+emp_desig);
		System.out.println("Employee department is "+dept);
		System.out.println("Salary is "+salary);
		System.out.println("DOJ is "+doj);
		
		
	}
	
	public static void main(String[] args) {
		Emp e=new Emp();
		e.readData();
		e.displayData();
	}
	
     
}
