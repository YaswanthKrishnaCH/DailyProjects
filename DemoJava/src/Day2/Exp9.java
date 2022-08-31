package Day2;
import java.util.Scanner;

public class Exp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		Boolean flag=false;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					flag=true;
					break;
				}
			}
			if(flag==true)
				{
					System.out.println("The matching character is "+s1.charAt(i));
					break;
				}
		}
		

	}

}
