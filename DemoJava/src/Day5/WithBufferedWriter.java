package Day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class WithBufferedWriter {
	void writeToFile(){
		String text="Writing file using Buffered Writer";
		try {
			BufferedWriter buff_writer=new BufferedWriter(new FileWriter("bufferedWriter.txt"));
			buff_writer.write(text);
			System.out.println(text);
			System.out.println("File is succesfully created with the context.");
			buff_writer.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void readFromFile() {
		char[] array=new char[100];
		try
		{
			BufferedReader buff_reader=new BufferedReader(new FileReader("bufferedWriter.txt"));
			buff_reader.read(array);
			System.out.println("\n********Data in the file");
			System.out.println(array);
			buff_reader.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}

}
