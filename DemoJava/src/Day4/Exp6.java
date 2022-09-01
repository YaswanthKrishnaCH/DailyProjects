package Day4;

import java.util.Scanner;

public class Exp6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char[] c=str.toCharArray();
		int a=c.length;
		System.out.println("The given Number is "+str);
		System.out.print("Converting the given number to words: ");
		if(a==0) 
			System.out.println("Empty String. Please Input the nuber");
		if(a>=4)
			System.out.println("Please give digit less than or equal to 3");
		String[] single_digit= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String[] two_digits ={ "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen","Seventeen", "Eighteen", "Nineteen" };
		String[] tens_multiple = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy","Eighty", "Ninety" };
		String[] tens_power = {"Hundred"};
		if(a==1)
			System.out.println(single_digit[c[0]-'0']);
		else if(a==2)
			{
				if(c[0]-'0'==1) 
					System.out.println(two_digits[c[1]-'0']);
				if(c[0]-'0'>1)
					{
					System.out.println(tens_multiple[c[0]-'0']);
					if(c[1]-'0'!=0) 
							System.out.print(" " +single_digit[c[1]-'0']);
					}
				}
		else if(a==3) {
			if(c[1]-'0'==0&&c[2]-'0'==0) {
				System.out.print(single_digit[c[0]-'0']);
				System.out.print(" "+tens_power[0]);
				}
			else {
			System.out.print(single_digit[c[0]-'0']);
			System.out.print(" "+tens_power[0]);
			if(c[1]-'0'==0)
			{
				System.out.print(" and ");
				System.out.print(single_digit[c[2]-'0']);
				}
			else if(c[1]-'0'==1) {
				System.out.print(" and ");
				System.out.print(two_digits[c[2]-'0']);
				}
			else if(c[2]-'0'==0) {
				System.out.print(" and ");
				System.out.print(tens_multiple[c[1]-'0']);
				}
			else if(c[2]-'0'>0) {
				System.out.print(" and ");
				System.out.print(tens_multiple[c[1]-'0']);
				System.out.print(" "+single_digit[c[2]-'0']);
				}
			}
		}
	}
}
