package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import stream.dao.data;

public class stream implements Comparable<stream>{
	//2
	public static void main(String[] args) {

		List<String> cats =  new ArrayList<String>(data.cats);
		//2a
		//2b
		//2c
		//2d
		List<String> catNames = cats.stream().map(String::toString).collect(Collectors.toList());
		Collections.sort(catNames);
		//2e 
		System.out.println(catNames);
	}

	@Override
	public int compareTo(stream o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}

