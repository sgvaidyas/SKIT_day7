import java.util.Scanner;

public class Pg4_jaggedarray {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int r;
		System.out.println("enter no of rows ");
		r=ob.nextInt();
		
		int a[][]=new int[r][];
		
		input(a);
		output(a);
	}
	static void input(int[][] a)
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the array elements");
		int c;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Please enter no of cols=");
			c=ob.nextInt();
			System.out.println("enter "+c+ " elements");
			a[i] = new int[c];
			
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]= ob.nextInt();
			}
		}
	}
	static void output(int[][] a)
	{
		
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +"\t");
			}
			System.out.println();
		}
	}

}
