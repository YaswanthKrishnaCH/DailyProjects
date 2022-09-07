package Day7;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerInitializedSingleton.getInstance();
		StaticBlockSingleton.getInstance();
		LazyInitializationSingleton.getInstance();
		ThreadSafeSingleton.getInstance();
		
		//2nd Time
		EagerInitializedSingleton.getInstance();
		StaticBlockSingleton.getInstance();
		LazyInitializationSingleton.getInstance();
		ThreadSafeSingleton.getInstance();

	}

}
