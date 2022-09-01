package Day5;

import java.io.Serializable;

public class Dog implements Serializable{
	String breedName;
	long cost;
	int age;
	public Dog() {
		
	}
	public Dog(String breadName, long cost, int age) {
		this.breedName = breadName;
		this.cost = cost;
		this.age = age;
	}
	public String getBreedName() {
		return breedName;
	}
	public void setBreedName(String breedName) {
		this.breedName = breedName;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [breedName=" + breedName + ", cost=" + cost + ", age=" + age + "]";
	}
	
	
	

}
