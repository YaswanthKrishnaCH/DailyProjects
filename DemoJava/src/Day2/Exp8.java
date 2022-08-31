package Day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exp8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Boolean flag=true;
		List<String> selectedItems=new ArrayList<String>();
		int i=0;
		while(flag)
		{
			System.out.println("Enter the item:");
			String str=s.nextLine();
			switch(str)
			{
			case "MD":selectedItems.add(i,"Masala Dosa:MD");
						break;
						
			case "PD":selectedItems.add(i,"Plain Dosa:PD");
						break;
			case "ID":selectedItems.add(i,"Idli:ID");
						break;
			default:System.out.println("You have entered the wrong items");
						break;
			}
			System.out.println("Do you want to enter another item (Y) or give the bill (N)");
			String consent=s.nextLine();
			if(consent.equalsIgnoreCase("N"))
				flag=false;
			
		}
		if(selectedItems!=null)
		{
		System.out.println("Selected Items:");
		for(String item:selectedItems)
			System.out.println(item);
		}
	}

}
