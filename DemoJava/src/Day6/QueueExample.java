package Day6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	Queue<Message> queObj=new LinkedList<>();
	
	void add(Message obj){
		queObj.add(obj);
	}
	
	void display(){
		Iterator<Message> iter=queObj.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
