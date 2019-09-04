import java.util.Scanner;

/*
 write a Java program to create a class called player with name, age , 
 total run as members, create 5 player object using primary constructor  
 and display the details of Cricket Player having more than  5000 runs 
 */
public class Player {
	
	String pname;
	int age;
	int tot_run;
	
	
	public Player() 
	{
		pname="Sushil";
		age=24;
		tot_run=23000;
     
	}
	
	public void readData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details of Player");
		pname=sc.next();
		age=sc.nextInt();
		tot_run=sc.nextInt();
	}
	
	public void dispData()
	{
		if(tot_run>5000)
		{
			System.out.println("Details are:"+pname+"   "+age+"  "+tot_run);
		}
		else
		{
			System.out.print("");
		}
	}
	
	
	
	public static void main(String[] args) {
		Player c=new Player();
		/*c.readData();
		Player d=new Player();
		d.readData();
		Player e=new Player();
		e.readData();
		Player f=new Player();
		f.readData();
		Player g=new Player();
		g.readData();
		c.dispData();
		d.dispData();
		e.dispData();
		f.dispData();
		g.dispData();*/
		
		
	}
}

