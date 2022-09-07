package Day3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{
	private String name;
	private String address;
	private Double salary;
	Employee(){
	}
	Employee(String name,String address, Double salary) throws Exception
	{
		if(name.equals(null)|| name.isEmpty())
			throw new NameException("Name not given");
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
	void print()
	{
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("Salary :"+salary);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
class SoftwareEngineers extends Employee{
	List<String> skills;
	List<String> clients;
	int experience;
	public SoftwareEngineers(String name,String address,Double salary,List<String> skills,List<String> clients,int experience) throws Exception {
		super(name,address,salary);
		this.skills=skills;
		this.clients=clients;
		this.experience=experience;
	}
	void print()
	{
		super.print();
		System.out.println("SKILLS:-------");
		skills.forEach(System.out::println);
		System.out.println("CLIENTS:-------");
		clients.forEach(System.out::println);
		System.out.println("Experience: "+experience);
	}
	@Override
	public String toString() {
		return  super.toString()+" SoftwareEngineers [skills=" + skills + ", clients=" + clients + ", experience=" + experience + "]";
	}
	
}
class Managers extends SoftwareEngineers{
	List<String> teams;
	double bonus;
	List<Double> budgets;
	public Managers(String name,
			String address,
			double salary,
			List<String> skills,
			List<String> clients,
			int experience,
			List<String> teams,
			double bonus,
			List<Double> budgets
			) throws Exception
	{
		super(name,address,salary,skills,clients,experience);
		this.teams=teams;
		this.bonus=bonus;
		this.budgets=budgets;
	}
	void print() {
		super.print();
		System.out.println("TEAMS--------");
		teams.forEach(System.out::println);
		System.out.println("Bonus : "+bonus);
		System.out.println("BUDGETS--------");
		budgets.forEach(System.out::println);
		
	}
}
class CEO extends Managers{
	Double bonus;
	int noOfManagersReporting;
	public CEO(String name,
			String address,
			double salary,
			List<String> skills,
			List<String> clients,
			int experience,
			List<String> teams,
			double bonus2,
			List<Double> budgets,
			double bonus,
			int noOfManagersReporting
			) throws Exception
	{
		super(name,address,salary,skills,clients,experience,teams,bonus,budgets);
		this.bonus=bonus2;
		this.noOfManagersReporting=noOfManagersReporting;
	}
	void print() {
		super.print();
		System.out.println("Bonus: "+bonus);
		System.out.println("No Of Managers Reporting: "+noOfManagersReporting);
	}
}
class NameException extends Exception{
	NameException(String msg)
	{
		super(msg);
	}
}
public class Exp3 {

	public static void main(String[] args) {
		try {
			
		Employee e=new CEO(
				"",
				"Andhra Pradesh",2000000,
				new ArrayList<String>(Arrays.asList("Java","Python","Azile")),
				new ArrayList<String>(Arrays.asList("Aetna","SVB","MasterCard")),
				20,
				new ArrayList<String>(Arrays.asList("Avengers","Fantastic 4","Power Rangers")),
				200000,
				new ArrayList<Double>(Arrays.asList(new Double(2000000),new Double(32382222),new Double(237827382))),
				2000000,
				20
				);
		e.print();
		}
		catch(NameException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		

	}

}
