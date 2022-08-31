package Day3;
import java.util.Scanner;
 enum Planet {
	Mercury(3.303e+23, 2.4397e6),
    Venus(4.867e+24, 6.0518e6),
    Earth(5.976e+24, 3.3972e6),
    Mars(6.421e+23, 3.3972e6),
    Jupiter(1.9e+27, 7.1492e7),
    Saturn(5.688e+26, 6.0268e7),
    Uranus(8.686e+25, 2.5559e7),
    Neptune(1.024e+26, 2.4746e7);
	public static final double G=6.67300E-11;    
	private final double mass;
	private final double radius;

	
	Planet(double mass, double radius)
	{
		this.mass=mass;
		this.radius=radius;
	}
	private double mass()
	{return mass;}
	private double radius() {return radius;}
	double surfaceGravity() {
		return G*mass/(radius*radius);
	}
	double surfaceWeight(double otherMass)
	{
		return otherMass*surfaceGravity();
	}
}

public class PlanetWeight{
	

	
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		double earthWeight=s.nextDouble();
		double mass=earthWeight/Planet.Earth.surfaceGravity();
		for(Planet p:Planet.values())
			System.out.println("Your weight on "+p+" is  "+p.surfaceWeight(mass));
	}
	
}
