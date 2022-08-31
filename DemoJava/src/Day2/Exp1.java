package Day2;
import java.util.Scanner;

public class Exp1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		//COnverting string to char Array without toCharArray()
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		System.out.println(ch);

	}

}
