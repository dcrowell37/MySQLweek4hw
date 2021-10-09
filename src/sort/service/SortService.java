package sort.service;

import java.util.Comparator;
import java.util.List;
import mysqlweek4.Cat;
import sortdao.SortDao;

public class SortService {
	private SortDao sortDao = new SortDao();
	
	public List<Cat> getCats() {
		List<Cat> cats = sortDao.getCat();
		Comparator<Cat> comp = null;
		
		//g
		comp = (c1, c2) -> Cat.compare(c1, c2);
		
		//h
		comp = Cat::compare;
		cats.sort(comp);
		return cats;
		
		
	}
	}
