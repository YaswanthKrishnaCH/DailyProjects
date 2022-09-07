package Day3;

import java.awt.Point;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HRManagementSystem {
	
	Map<Integer,Employee> obj;
	
	public static void main(String[] args) throws Exception {
		HRManagementSystem obj=new HRManagementSystem();
		Map<Integer,Employee> emp=obj.populate();
		obj.display(emp);
		
	}
	
	Map<Integer,Employee> populate() throws Exception {
		obj=new HashMap<>();
		obj.put(1001,new Employee("Yaswanth","Andhra Pradesh",1000000d));
		obj.put(1002,new Employee("Krishna","Telangana",5000000d));
		obj.put(1003, new SoftwareEngineers("Rajesh","Karnataka", 430000d,Arrays.asList("Java","Python"),Arrays.asList("Aetna","SVB","MasterCard"), 12));
		return obj;
	}
	void display(Map<Integer,Employee> obj) {
		
		for(Map.Entry<Integer, Employee> entry:obj.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
