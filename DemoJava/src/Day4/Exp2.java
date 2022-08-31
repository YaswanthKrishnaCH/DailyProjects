package Day4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exp2 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String patterns="([0-2]\\d|(30|31))/(0[1-9]|1[0-2])/(\\d\\d\\d\\d)|([0-2]\\d|(30|31))/(0[1-9]|1[0-2])/(\\d\\d)";
		Pattern p=Pattern.compile(patterns);
		Matcher matcher=p.matcher(str);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
