import java.util.Scanner;

class Employee
{
	int empid;
	String name,design;
	float sal;
	//default constructor
	Employee()
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("\nEnter Empid     = ");
		empid=ob.nextInt();
		ob.nextLine();
		System.out.print("\nEnter EmpName   = ");
		name=ob.nextLine();
		System.out.print("\nEnter EmpDesig  = ");
		design=ob.nextLine();
		System.out.print("\nEnter EmpSal    = ");
		sal=ob.nextFloat();
	}
	Employee(int empid,String name,String Desig,float salary)
	{
		this.empid=empid;
		this.name= name;
		design=Desig;
		sal=salary;
	}
	void display()
	{
		System.out.println("____________________________");		
		System.out.println("EMPID      = " + empid);
		System.out.println("EMPNAME    = " + name);
		System.out.println("EMPDESIG   = " + design);
		System.out.println("EMPSAL     = " + sal);
		
	}
}
public class EmployeeStruct {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee(222,"Sanjay","CFO",8900000);
		
		emp.display();
		emp1.display();
		
	}

}
