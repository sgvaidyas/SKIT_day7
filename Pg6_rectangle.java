import java.util.Scanner;

class Rectangle
{
	int len,bred,area,peri;
	Rectangle()
	{
		len=0;
		bred=0;
	}
	Rectangle(int x)
	{
		len=x;
		bred=x;
	}
	Rectangle(int x,int y)
	{
		len=x;
		bred=y;
	}
	void getdata()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter len & bred =");
		len=ob.nextInt();
		bred=ob.nextInt();
	}
	void cal()
	{
		area = len*bred;
		peri = 2*(len+bred);
	}
	void display()
	{
		System.out.println("_________________");
		System.out.println("LENGTH     = "+len);
		System.out.println("BREADTH    = "+bred);
		System.out.println("AREA       = "+area);
		System.out.println("PERIMETER  = "+peri);
		
	}
}
public class Pg6_rectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.cal();
		r1.display();
		r1.getdata();
		r1.cal();
		r1.display();
		Rectangle r2 = new Rectangle(7,9);
		r2.cal();
		r2.display();
		Rectangle r3 = new Rectangle(9);
		r3.cal();
		r3.display();
		
		
	}

}
