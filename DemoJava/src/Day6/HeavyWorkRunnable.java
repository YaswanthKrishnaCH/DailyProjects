package Day6;

public class HeavyWorkRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Doing heavy IO processing--START "+Thread.currentThread().getName()+" ID:"+Thread.currentThread().getId());
		try {
			Thread.sleep(1000);
			
			doFileProcessing();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Doing heavy IO processing--END "+Thread.currentThread().getName()+" ID:"+Thread.currentThread().getId());
		
	}
	
	private void doFileProcessing() throws InterruptedException{
		Thread.sleep(5000);
	}
	
	

}
