package Day3;
interface abc{
	String st="Primary Colors";
}

enum Colors implements abc{
	White,Red();
	int value;
	int getValue() {
		return value;
	}
}


public class Exp1 {

	public static void main(String[] args) {
		Colors c1=Colors.Red;
		Colors c2=Colors.White;
		System.out.println("Value of c1 is "+c1.getValue()+" "+c1.st+" "+c2.getValue()+" "+c1.ordinal());
		System.out.println(c1);
		
	}
	
}