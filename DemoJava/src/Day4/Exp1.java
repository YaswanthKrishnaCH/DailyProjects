package Day4;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exp1 {

	public static void main(String[] args) throws IOException {
		// Pattern to find the phone numbers from the string
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String patterns="((\\+91)( |-)?((9|8|7|6)\\d{9}))|(((9|8|7|6)\\d{9}))";
		Pattern p=Pattern.compile(patterns);
		Matcher matcher=p.matcher(str);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		
	}

}
