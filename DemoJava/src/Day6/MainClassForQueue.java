package Day6;

public class MainClassForQueue {

	public static void main(String[] args) {

		QueueExample queue=new QueueExample();
		queue.add(new Message());
		queue.add(new Message("Event 1"));
		queue.display();
		
	}

}
