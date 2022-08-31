package Day3;
import java.util.ArrayList;
import java.util.List;

public class VanEckSequence {

	public static void main(String[] args) {
	
		List<Integer> arr=new ArrayList<>();
		arr.add(0);
		arr.add(0);
		int k=0;
		while(true)
		{
			Integer[] a=new Integer[arr.size()];
			a=arr.toArray(a);
			
				int count=1;
				//let i be the index of the final element of the array.
				//count<=i--- checking the elements from the last
				for(int i=a.length-1;count<=i;)
				{
					if(a[i]==a[i-count])
						{arr.add(count);break;}
					if(count-i==0)
					{arr.add(0);break;}
					count++;
				}
				System.out.println(arr);
				k++;
				if(k==20)
					break;
			}
		}

	}

