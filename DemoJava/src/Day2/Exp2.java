package Day2;
import java.util.Scanner;

public class Exp2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer str=new StringBuffer(s.nextLine());
		String strr=str.toString();
		str.reverse();
		if(str.toString().equals(strr))
			System.out.println("The String "+strr+" is a Palindrome");
		else
			System.out.println("The String "+strr+" is not a Palindrome");
		
		
	}

}
