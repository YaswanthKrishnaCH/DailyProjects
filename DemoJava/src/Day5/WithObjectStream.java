package Day5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WithObjectStream {
	public void writeToFile() {
		int obj1=12;
		String fileContent="Hello guru premakosame roii jevitham";
		try {
			FileOutputStream file=new FileOutputStream("WithObjectStream.txt");
			ObjectOutputStream output=new ObjectOutputStream(file);
			output.writeInt(obj1);;
			output.writeObject(fileContent);
			output.close();
			}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
