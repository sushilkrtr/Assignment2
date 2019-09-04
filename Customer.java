import java.util.Scanner;

/*
 write a Java program to create a Customer class with three member variable cname   
  ,accountno,      balance , create five  Customer object- use primary constructor and 
   write a method to display all the details of the customer having   balance 
   more than 5000.
 */
public class Customer {
	
	String cname;
	int acc_no;
	double balance;
	
	
	public Customer() 
	{
		cname="Sushil";
		acc_no=342323;
		balance=2309764.89;
     //System.out.println("Customer details are ");
	}
	
	public void readData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details of customer");
		cname=sc.next();
		acc_no=sc.nextInt();
		balance=sc.nextDouble();
	}
	
	public void dispData()
	{
		if(balance>5000)
		{
			System.out.println("Details are:"+cname+"   "+acc_no+"  "+balance);
		}
		else
		{
			System.out.print("");
		}
	}
	
	
	
	public static void main(String[] args) {
		Customer c=new Customer();
		c.readData();
		Customer d=new Customer();
		d.readData();
		Customer e=new Customer();
		e.readData();
		Customer f=new Customer();
		f.readData();
		Customer g=new Customer();
		g.readData();
		c.dispData();
		d.dispData();
		e.dispData();
		f.dispData();
		g.dispData();
		
		
	}
}
