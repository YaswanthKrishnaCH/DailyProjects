package Day2;
import java.util.Scanner;

public class Exp7 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int len=s.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr=new int[len];
		for(int i=0;i<len;i++)
			arr[i]=s.nextInt();
		for(int i=0;i<len-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				System.out.println("It should be moved by "+(i+1)+" positions");
				break;
			}
		}
			
	}
}
