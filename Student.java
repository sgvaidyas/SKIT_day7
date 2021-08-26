import java.util.Scanner;

class StudentDetails
{
	//data members
	int roll;
	String name;
	float marks;
	//member functions
	void getdata()
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("\nEnter the Roll = ");
		roll=ob.nextInt();
		ob.nextLine();
		System.out.print("\nEnter the NAME = ");		
		name=ob.nextLine();
				
		System.out.print("\nEnter the MARKS = ");
		marks=ob.nextFloat();
	}
	void display()
	{
		System.out.println("______________________");
		System.out.println("ROLL   = " + roll);
		System.out.println("NAME   = " + name);
		System.out.println("MARKS  = " + marks);
		
	}
}
public class Student {

	public static void main(String[] args) {
		StudentDetails stu = new StudentDetails();		
		stu.getdata();
		stu.display();
		

	}

}
