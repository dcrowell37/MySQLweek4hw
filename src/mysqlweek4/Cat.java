package mysqlweek4;

public class Cat {
	//b
	public String name;
		
	
	public Cat(String name) {
		this.name = name;
	} 
	//d
	@Override
	public String toString() {
		return "Cat: " + name;
	}
	//c
	//e
	public static int compare(Cat c1, Cat c2) {
		return c1.name.compareTo(c2.name);
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
