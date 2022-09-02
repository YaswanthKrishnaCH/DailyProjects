package Day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WithFileOutputStream {
	public void writeToFile() {
		String fileContent="Write into file using FileOutputStream";
		try {
			FileOutputStream outputStream=new FileOutputStream("fileOutputStream.txt");
			byte[] strToBytes=fileContent.getBytes();
			outputStream.write(strToBytes);
			System.out.println("File is created succesfully with the content");
			outputStream.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void readFromFile() {
		byte[] array=new byte[100];
		try {
			FileInputStream inputStream=new FileInputStream("fileOutputStream.txt");
			inputStream.skip(5);
			System.out.println("*******The contents in the file is:");
			int i=inputStream.read();
			while(i!=-1)
			{
				System.out.print((char)i);
				i=inputStream.read();
			}
			inputStream.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
