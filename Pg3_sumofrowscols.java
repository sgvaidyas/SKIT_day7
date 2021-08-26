import java.util.Scanner;

public class Pg3_sumofrowscols {

	static void sumofrows(int[][] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\nSum of row "+ i +" = ");
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+ a[i][j];
			}
			System.out.print(sum);
			sum=0;
		}
	}
	static void sumofcols(int[][] a)
	{
		int sum=0;
		int c=a[0].length;
		for(int j=0;j<c;j++)
		{
			System.out.print("\nSum of col "+ j +" = ");
			for(int i=0;i<a.length;i++)
			{
				sum=sum+ a[i][j];
			}
			System.out.print(sum);
			sum=0;
		}
	}
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int r,c;
		System.out.println("enter no of rows & cols");
		r=ob.nextInt();
		c=ob.nextInt();
		int a[][] = new int[r][c];	
		
		input(a);
		output(a);
		sumofrows(a);
		sumofcols(a);

	}
	static void input(int[][] a)
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(String.format("Enter the lements of %d row",i));
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
