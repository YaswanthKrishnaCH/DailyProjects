package Day2;
import java.util.Scanner;

public class JosephusProblem {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int count=s.nextInt();
		int[] arr=new int[count];
		for(int i=0;i<count;i++)
			arr[i]=1;
		int index=0,j=1;
		//while()
		{
		
		for(int i=0;i<count-1;i=i+2)
		{
			if(arr[i+j]==1)
				{
					arr[i+j]=0;
					index=i+j+1;
				}
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println(index);
		if(index%2==0)
			j=j+1;
		}
	}

}
