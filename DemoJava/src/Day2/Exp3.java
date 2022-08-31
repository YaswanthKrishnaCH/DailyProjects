package Day2;
import java.util.Scanner;

public class Exp3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String[] st=str.split("\\|");
		System.out.println(st[2]);
		s.close();
	}

}
