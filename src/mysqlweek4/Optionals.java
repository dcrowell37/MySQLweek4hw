package mysqlweek4;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

import sortdao.SortDao;

public class Optionals {
	
//3a
	public static Cat methodA(Optional<Cat> optionalCat) {
		//3b
		return optionalCat.orElseThrow(() -> new NoSuchElementException("Object is not present")); 
	}
	public static void methodB() {
		
		Optional<Cat> oCat1 = Optional.of(SortDao.cats.get(0));
		
		try {
			methodA(oCat1);
			System.out.println(oCat1);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		Optional<Cat> oCat2 = Optional.empty();
		
		try {
			methodA(oCat2);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void main(String[] args) {
		methodB();
		
	}


}
