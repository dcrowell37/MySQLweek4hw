package mysqlweek4;

import java.util.List;

import sort.service.SortService;

public class MySort {
	private SortService sortService = new SortService();
	
	//i
	public static void main(String[] args) {
		new MySort().run();
	}

	private void run() {
		List<Cat> cats = sortService.getCats();
		//j
		print(cats);

		
	}
		//j
	private void print(List<Cat> cats) {
		cats.forEach(Cat -> System.out.println(Cat.getName()));
		
		cats.forEach(System.out::println);
	}

}
