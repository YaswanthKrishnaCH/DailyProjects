package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class Exp3 {

	public static void main(String[] args) {
		int denominations[]= {1,2,5,10,20,50,100,200,500};
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int dp[]=new int[number+1];
		Arrays.fill(dp,-1);
		int ans=minCoins(number, denominations,dp);
		int i=0;
		for(int x:dp)
		{
			System.out.println("dp["+i+"]="+x);
			i++;
		}
		System.out.println(ans);
	}
	
	static int minCoins(int number,int[] denominations,int[] dp)
	{
		if(number==0)
			return 0;
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<denominations.length;i++)
		{
			if(number-denominations[i]>=0)
				{
					int subAns=0;
					if(dp[number-denominations[i]]!=-1)
						subAns=dp[number-denominations[i]];
					else
						subAns=minCoins(number-denominations[i], denominations,dp) ;
					if(subAns!=Integer.MAX_VALUE && subAns+1<ans)
						ans=subAns+1;
				}
		}
		return dp[number]=ans;
	}

}
