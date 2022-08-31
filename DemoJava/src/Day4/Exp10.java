package Day4;

public class Exp10 {

	public static void main(String[] args) {
		
		System.out.print("The strong numbers between 1 to 1000 are: ");
		for(int j=1;j<1000;j++)
		{
			int dup=j,result=0;
			while(dup>0)
			{
				int digit=dup%10;
				int temp=1;
				for(int i=1;i<=digit;i++) {
					temp=temp*i;
				}
				result=result+temp;
				dup=dup/10;
			}
			if(result==j)
				System.out.print(result+" ");
		}
	}

}
