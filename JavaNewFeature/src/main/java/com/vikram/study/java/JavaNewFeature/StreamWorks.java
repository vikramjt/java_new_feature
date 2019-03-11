package com.vikram.study.java.JavaNewFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWorks {
	
	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("ABanchan");
		arr.add("Astrig");
		arr.add("Test");
		arr.add("ABcd");
		
		normalIterationSortingStringCollection(arr);
		streamSortingStringCollection(arr);
	}
	
	public static void normalIterationSortingStringCollection(List<String> arr) {
		System.out.println("With normal Iteration sorting String collection stating with AB--->");
		for (String elem : arr) {
			if(elem.startsWith("AB")) {
				System.out.println("Elem is : " + elem);
			}
		}
	}
	
	public static void streamSortingStringCollection(List<String> arr) {
		System.out.println("With Collect method sorting String collection stating with AB --->");
		System.out.println(arr.stream().filter(elem -> elem.startsWith("AB")).map(elem -> "Elem is : " + elem).collect(Collectors.toList()));
		System.out.println("With forEach method sorting String collection stating with AB--->");
		arr.stream().filter(elem -> elem.startsWith("AB")).map(elem -> "Elem is : " + elem).forEach(System.out::println);
	}
}
