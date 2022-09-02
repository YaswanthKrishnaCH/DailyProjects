package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClassWithArrayList {

	public static void main(String[] args) {
			WithObjectStreamWithArrayList obj=new WithObjectStreamWithArrayList();
			List<Dog> list=input();
			obj.writeToFile(list);
			obj.readFromFile();
			obj.remove(list);
			
			
			/*WithBufferedWriter obj=new WithBufferedWriter();
			obj.writeToFile();
			obj.readFromFile();
			*/
			/*WithFileOutputStream obj=new WithFileOutputStream();
			obj.writeToFile();
			obj.readFromFile();
			*/
		}
		
		
		static List<Dog> input() {
			Scanner s=new Scanner(System.in);
			WithObjectStreamWithArrayList.Initialize();
			System.out.println("Enter the number of dogs:");
			int n=s.nextInt();s.nextLine();
			List<Dog> list=new ArrayList<>();
			for(int i=0;i<n;i++)
			{
			System.out.println("Give the breed Name:");
			String breedName=s.nextLine();
			System.out.println("Give the cost of the dog:");
			long cost=s.nextLong();
			System.out.println("Give the Age of the dog:");
			int age=s.nextInt();s.nextLine();
			Dog dogObj=new Dog(breedName,cost,age);
			list.add(dogObj);
			}
			return list;
			
		

	}

}
