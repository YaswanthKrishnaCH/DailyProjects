package Day4;

public class Exp11 {

	public static void main(String[] args) {
		  int num,rem,sum=0,count=0;
	        for(int i=1;i<=1000;i++) {
	            num=i;
	            while(num>0) {
	                num/=10;
	                count++;
	            }
	            
	            num=i;
	            while(num>0) {
	                rem = num%10;
	                sum+=(Math.pow(rem,count));
	                num/=10;
	            }
	            count=0;
	            if(sum==i) {
	                System.out.println(sum+" ");
	            }
	            sum=0;



	       }

	}

}
