package Day2;
import java.util.Scanner;

public class Exp6 {

	public static void main(String[] args) {
		// Sum of  diagonal elements
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row size");
		int row=s.nextInt();
		System.out.println("Enter the column size");
		int col=s.nextInt();
		System.out.println("Enter the elements");
		int[][] arr=new int[row][col];
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				{
				arr[i][j]=s.nextInt();
				if(i==j)
					sum=sum+arr[i][j];
				}
		}
		System.out.println("Sum of diagonal emenets is :"+sum);
		

	}

}
