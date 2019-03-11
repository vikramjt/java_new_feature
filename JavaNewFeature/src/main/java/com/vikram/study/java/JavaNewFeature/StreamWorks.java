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
		normalIterStrColl(arr);
		streamStrColl(arr);
	}
	
	public static void normalIterStrColl(List<String> arr) {
		System.out.println("With normal Iteration --->");
		for (String elem : arr) {
			if(elem.startsWith("AB")) {
				System.out.println("Elem is : " + elem);
			}
		}
	}
	
	public static void streamStrColl(List<String> arr) {
		System.out.println("With Collect method --->");
		System.out.println(arr.stream().filter(elem -> elem.startsWith("AB")).map(elem -> "Elem is : " + elem).collect(Collectors.toList()));
		System.out.println("With forEach method --->");
		arr.stream().filter(elem -> elem.startsWith("AB")).map(elem -> "Elem is : " + elem).forEach(System.out::println);
	}
}
