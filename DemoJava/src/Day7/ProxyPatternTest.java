package Day7;

public class ProxyPatternTest {

	public static void main(String[] args) {
		CommandExecutor executor=new CommandExecutorProxy("user1","yash");
		try {
			executor.runCommand("ls");
			executor.runCommand("rm -rf abc.pdf");
		}
		catch(Exception e)
		{
			System.out.println("Exception message::"+e.getMessage());
		}
	}

}
