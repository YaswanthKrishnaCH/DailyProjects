package Day6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Cars {
	
	public Set<String> getCarsOfIndia()
	{
		HashSet<String> carsOfIndia=new HashSet<>();
		carsOfIndia.add("Maruti Suzuki");
		carsOfIndia.add("Mahindra");
		carsOfIndia.add("Tata");
		carsOfIndia.add("Hindustan Motors");

		Set<String> cars=new HashSet<>(carsOfIndia);
		carsOfIndia.add("sHDKSA");
		Set<String> cars1=(Set)carsOfIndia.clone();
		carsOfIndia.add("sjA");
		
		return carsOfIndia;
	}
	
	public Set<String> getCarsOfJapanese()
	{
		Set<String> carsOfJapanese=new LinkedHashSet<>();
		carsOfJapanese.add("Honda");
		carsOfJapanese.add("Toyota");
		carsOfJapanese.add("Nissan");
		carsOfJapanese.add("Mitsubishi");
		carsOfJapanese.add("Maruti Suzuki");
		return carsOfJapanese;
	}
	
	
}
