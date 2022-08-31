package Day4;

public class Exp5 {

	public static void main(String[] args) {
		//Perect number
		for(int j=1;j<=1000;j++)
		{
			int num=j;
			int result=0;
			for(int i=1;i<=num/2;i++)
			{
				if(num%i==0)
					result=result+i;
			}
			if(result==j)
				System.out.println(result);
		}
	}

}
