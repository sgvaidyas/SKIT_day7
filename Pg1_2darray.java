import java.util.Scanner;

public class Pg1_2darray {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int a[][] = new int[2][3];
		int i,j;
		System.out.println("Enter the array elements");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]= ob.nextInt();
			}
		}
		System.out.println("2d array elements are =");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
