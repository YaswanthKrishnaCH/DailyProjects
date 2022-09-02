package Day6;

import java.time.LocalDateTime;

public class Message {
	String event;
	LocalDateTime timeStamp;
	Message(){
		timeStamp=LocalDateTime.now();
	}
	Message(String msg)
	{
		event=msg;
		timeStamp=LocalDateTime.now();
	}
	@Override
	public String toString() {
		return "Message [event=" + event + ", timeStamp=" + timeStamp + "]";
	}
	
	

}
