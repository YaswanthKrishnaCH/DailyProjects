package Day5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WithObjectStream {
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
	
	public void writeToFile(Object[] obj) {
		try {
			
			Dog[] dogArr=(Dog[]) obj;
			for(int i=0;i<dogArr.length;i++) {
				output.writeObject(dogArr[i]);
			}
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

}
