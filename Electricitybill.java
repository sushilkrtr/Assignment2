import java.util.Scanner;

public class Electricitybill {
	int cust_no;
	String cust_name;
	int unit;
	double chg=0;
	public void readData()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the customer number");
	  cust_no=sc.nextInt();
	  System.out.println("Enter the name of customer");
	  cust_name=sc.next();
	  System.out.println("Enter the number of unit");
	  unit=sc.nextInt();
	}
	public void displayData()
	{
		   System.out.println("customer number"+cust_no);
		   System.out.println("name of customer"+cust_name);
		   System.out.println(" number of unit"+unit);
	}
	
	public void computeBill()
	{
		
		if(unit<=100)
		  {
			   chg=(unit*1.20);
			  System.out.println(+chg+"is the total amount to be paid by "+cust_name);
		  }
		  else if(unit>100 && unit<=300)
		  {
			 chg=(120+(unit-100)*2.00); 
			System.out.println(+chg+"is the total amount to be paid by "+cust_name);
		  }
		  else if(unit>300 && unit<=600)
		  {
			   chg=(120+400+(unit-300)*3.00);
			  System.out.println(+chg+"is the total amount to be paid by "+cust_name);
		  }
		  else
		  {
			   chg=(120+400+900+(unit-600)*5.00);
			  System.out.println(+chg+"is the total amount to be paid by"+cust_name);
		  }
	}

	public static void main(String[] args) {
		
		Electricitybill e=new Electricitybill();
		e.readData();
		Electricitybill f=new Electricitybill();
		f.readData();
		e.displayData();
		f.displayData();
		System.out.println("-----------------------------");
		e.computeBill();
		f.computeBill();
		
	}
}
