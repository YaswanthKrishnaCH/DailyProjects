package Day2;
import java.util.Scanner;

public class Exp5 {

	public static void main(String[] args) {
		//Contents of the 2D array
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3x3 elements:");
		int[][] arr=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				arr[i][j]=s.nextInt();
				
		}
		for(int[] a:arr)
			for(int b:a)
			System.out.println(b);

	}

}
