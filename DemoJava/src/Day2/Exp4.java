package Day2;
import java.util.Scanner;

public class Exp4 {

	public static void main(String[] args) {
		//LEAP AND NON LEAP WITH TERNERY OPERATORS
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		System.out.println(year>0?(year%4==0?((year%100==0 && year%400!=0)?"NON LEAP":"LEAP"):"NON LEAP"):"NOT A POSITIVE NUMBER");
	}

}
