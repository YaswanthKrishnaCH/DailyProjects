package Day7;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {System.out.println("StaticBlockSingleton instance created");}
	
	//TRY_CATCH TO catch the exception 
	static {
		try {
			instance=new StaticBlockSingleton();
		}
		catch(Exception e)
		{
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}

}
