package Day4;
public class Exp4 {

	public static void main(String[] args) {
		//Armstrong
		for(int j=1;j<=1000;j++)
		{
			int count=0;
			int dup=j,dup1=j;
			while(dup>0)
			{
				count++;
				dup=dup/10;
			}
			int result=0;
			for(int i=0;i<count;i++)
			{
				int digit=dup1%10;
				result=result+(int) (Math.pow(digit, count));
				dup1=dup1/10;
			}
			if(result==j)
				System.out.println("ARMSTRONG "+j);
		}
	}

}
