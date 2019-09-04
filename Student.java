
/*Write a Java program to create Student class with member variable as id, name,
mark and result. Use primary constructors to initialize the value of name, id and 
marks. Write a member function to find the result ad display the result along with 
the student details.*/

public class Student {
	int stu_id;
	String stu_name;
	int mark;
	String result;
	
	public Student()
	{
	stu_id=54;
	stu_name="sus";
	mark=33;
	result="pass";
	}
	
	public void result()
	{
		if(mark>=33)
		{System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) {
		
		Student s=new Student();
		s.result();
		
	}

}
