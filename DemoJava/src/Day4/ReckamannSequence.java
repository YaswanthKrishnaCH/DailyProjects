package Day4;

import java.util.Arrays;
import java.util.List;

public class ReckamannSequence {

	public static void main(String[] args) {
		Integer[] arr=new Integer[100];
		Arrays.fill(arr,-1);
		List<Integer> list=Arrays.asList(arr);
				
		list.set(0,0);
		int prevValue=0;
		for(int i=1;i<=99;i++)
		{
			prevValue=list.get(i-1);//get the prevValue which is store in list[i-1]
			if(prevValue-i>=0 && !list.contains(prevValue-i))
				list.set(i,prevValue-i);
			else
				list.set(i,prevValue+i);
			
		}
		System.out.println(list);
		
	}

}
