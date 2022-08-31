package Day3;
import java.util.ArrayList;
import java.util.List;

class GraphicsContext{
	void drawRect(int a,int b,int c,int d) 
	{
		System.out.println("Drew the Rectangle");
	}
	void drawCir(int a,int b,int c)
	{
		System.out.println("Drew the Circle");
	}
	void drawSqr(int a,int b,int c,int d)
	{
		System.out.println("Drew the Square");
	}
}
 interface Shape {
	 int yash=1;
	void draw(GraphicsContext gc);
	default int area() {
		System.out.println("AREA method called");
		return 0;
	}
}

class Rectangle implements Shape{
	public void draw(GraphicsContext gc)
	{
		int val=yash+20;
		gc.drawRect(20,20,50,70);
	}
}

class Circle implements Shape{
	public void draw(GraphicsContext gc)
	{
		gc.drawCir(20,20,50);
	}
}

class Square implements Shape{
	public void draw(GraphicsContext gc)
	{
		gc.drawSqr(20,20,50,70);
		area();
	}
}
public class Exp2{
	public static void main(String[] args) {
		List<Shape> list=new ArrayList<>();
		list.add(new Rectangle());
		list.add(new Circle());
		list.add(new Square());
		
		GraphicsContext gc=new GraphicsContext();
		list.forEach(shape->shape.draw(gc));
	}
}


