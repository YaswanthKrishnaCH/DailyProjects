package Day5;

import java.util.Scanner;

public class MainClassWithArray {

	public static void main(String[] args) {
		/*WithObjectStream obj=new WithObjectStream();
		Dog[] arr=input();
		obj.writeToFile(arr);
		System.out.println("The dogs in the file are:");
		obj.readFromFile();
		*/
		/*
		WithBufferedWriter obj=new WithBufferedWriter();
		obj.writeToFile();
		obj.readFromFile();
		*/
		WithFileOutputStream obj=new WithFileOutputStream();
		obj.writeToFile();
		obj.readFromFile();
		
	}
	
	
	static Dog[] input() {
		Scanner s=new Scanner(System.in);
		WithObjectStream.Initialize();
		System.out.println("Enter the number of dogs:");
		int n=s.nextInt();s.nextLine();
		Dog[] arr=new Dog[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Give the breed Name:");
		String breedName=s.nextLine();
		System.out.println("Give the cost of the dog:");
		long cost=s.nextLong();
		System.out.println("Give the Age of the dog:");
		int age=s.nextInt();s.nextLine();
		Dog dogObj=new Dog(breedName,cost,age);
		arr[i]=dogObj;
		}
		return arr;
		
	}

}
