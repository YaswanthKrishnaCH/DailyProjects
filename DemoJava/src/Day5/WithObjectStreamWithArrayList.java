package Day5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class WithObjectStreamWithArrayList {
	static FileOutputStream file;
	static ObjectOutputStream output;
	
	static void Initialize() {
		try {
		file= new FileOutputStream("Dog.txt");;
		output=new ObjectOutputStream(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void writeToFile(List<Dog> obj) {
		try {
				Iterator<Dog> iter=obj.iterator();	
				while(iter.hasNext())
				{
				output.writeObject(iter.next());
				}
				output.close();
			}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void readFromFile() {
		try {
			FileInputStream file=new FileInputStream("Dog.txt");
			ObjectInputStream objStream=new ObjectInputStream(file);
			System.out.println("The dogs in the file are:");
			while(true)
			{
				try {
				System.out.println(objStream.readObject());
				}
				catch (EOFException e) {
					System.out.println();
					objStream.close();
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	void remove(List<Dog> list) {
		System.out.println("Enter the index of the Dog to be removed:");
		Scanner s=new Scanner(System.in);
		list.remove(s.nextInt());
		WithObjectStreamWithArrayList.Initialize();
		writeToFile(list);
		readFromFile();

	}

}
