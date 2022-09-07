package Day7;

public class LazyInitializationSingleton {
	private static LazyInitializationSingleton instance;
	private LazyInitializationSingleton() {System.out.println("LazyInitializationSingleton instance created");}
	//can't create object in the class loading time, but creates object only when its called by consumer.
	public static LazyInitializationSingleton getInstance() {
		if(instance==null)
			instance=new LazyInitializationSingleton();
		return instance;
	}

}
