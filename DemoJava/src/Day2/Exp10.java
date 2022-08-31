package Day2;
import java.util.Scanner;

public class Exp10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=10;
		int b;
		String str=s.nextLine().toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			String ch=str.charAt(i)+"";
			if(ch.matches("[aeiou]"))
				count++;
		}
		System.out.println(count);

	}

}
