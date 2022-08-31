package Day1;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
	/*
	if(args.length>0)
	{
	Integer year=Integer.parseInt(args[0]);
	if(year%4==0)
	{
		if(year%100==0 && year%400!=0)
			System.out.println("Not a leap");
		else
			System.out.println("LEAP");
	}
	else
	{
		System.out.println("NOT A LEAP");
	}
	}
	else
		System.out.println("PLEASE provide 1 integer input");
	
	System.out.print("Hello \\");
	System.out.print("Hii");
	
	
	
	 */
		Scanner sc=new Scanner(System.in);
		/* 
		 //EXPONENT
		System.out.println("Enter the Base b:");
		int base=sc.nextInt();
		System.out.println("Enter the Exponent e:");
		int exp=sc.nextInt();
		int result=1;
		while(exp>0)
		{
			result=base*result;
			exp--;
		}
		System.out.println(result);
		*/
		
		/*//FIBONACCI
		System.out.println("Enter the count of the fibonacci series needed :");
		int count=sc.nextInt();
		System.out.println("FIBONACCI");
		int a=0;
		int b=1;
		System.out.print(b+" ");
		while(count>1)
		{
		int temp=a;//storing a in temp
		a=b;
		b=temp+b;
		System.out.print(b+" ");
		count--;
		}
		*/
		/*//MONTH 
		System.out.println("Enter the month number :");
		int month=sc.nextInt();
		switch(month)
		{
		case 1:System.out.println("JANUARY");
				break;
		case 2:System.out.println("FEBRUARY");
				break;
		case 3:System.out.println("MARCH");
				break;
		case 4:System.out.println("APRIL");
				break;
		case 5:System.out.println("MAY");
				break;
		case 6:System.out.println("JUNE");
				break;
		case 7:System.out.println("JULY");
				break;
		case 8:System.out.println("AUGUST");
				break;
		case 9:System.out.println("SEPTEMBER");
				break;
		case 10:System.out.println("OCTOBER");
				break;
		case 11:System.out.println("NOVEMBER");
				break;
		case 12:System.out.println("DECEMBER");
				break;
		default:System.out.println("Enter in the range of 1 to 12");
		}
		
		*/
		
		/*//PRIME NUMBERS
		System.out.println("The prime numbers from 1 to 1000 are: ");
		for(int i=2;i<=1000;i++)
		{
			int count=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
					count++;
				
			}
			if(count==1)
				System.out.print(i+" ");
		}
		
		*/
		
		/*//PATTERN
		 System.out.print("Enter the number: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		//FACTORIAL
		
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int result=1;
		while(n>=1)
		{
			result=result*n;
			n--;
		}
		System.out.println(result);
	}

}
