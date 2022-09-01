package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class Exp11 {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  System.out.println("Give the value of N:");
		  int N=s.nextInt();
		  System.out.println("Give the value of M:");
		  int M=s.nextInt();
		  int count=0,i=0;
		  int[] arr=new int[N];
		  Arrays.fill(arr,1);
		  while(arr[i]==1)
		  {
			  arr[i]=0;
			 // System.out.println("arr["+i+"] "+arr[i]+" count "+count);
			  count++;
			  i=((i+M)>=N)?i+M-N:i+M;
		  }
		  System.out.println("count "+count);
		  
	}

}
