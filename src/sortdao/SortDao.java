package sortdao;

import java.util.ArrayList;
import java.util.List;

import mysqlweek4.Cat;

//f
public class SortDao {
	public static List<Cat> cats = new ArrayList<>(List.of(
	new Cat("Jinx"),
	new Cat("Slim"),
	new Cat("Carlos"),
	new Cat("Pyro"),
	new Cat("Seymour")));
	
	public List<Cat> getCat() {
		return cats;
} 

}
