package Day4;

import java.util.Scanner;

public class Exp9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Give any number: ");
		int num=s.nextInt();
		System.out.print("The factors of the number are: ");
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
		}
	}

}
