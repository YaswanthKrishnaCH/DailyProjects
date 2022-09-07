package Day7;

public class EagerInitializedSingleton {
	
	public static final EagerInitializedSingleton instance=new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {System.out.println("EagerInitializedSingleton instance created");}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
