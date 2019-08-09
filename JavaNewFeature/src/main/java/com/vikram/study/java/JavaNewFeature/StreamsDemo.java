package com.vikram.study.java.JavaNewFeature;

import java.util.*; 
import java.util.stream.*; 
  
class StreamsDemo{
	public static void main(String args[]) 
  { 
  
    // create a list of integers 
    List<Integer> numberList = Arrays.asList(4,6,5,10,9,5,9,10); 
    System.out.println("Number List : "  + numberList); 
    // demonstration of map method 
    List<Integer> square = numberList.stream().map(x -> x*x). 
                           collect(Collectors.toList()); 
    System.out.println("Square of number List : "  + square + "\n"); 
  
    // create a list of String 
    List<String> namesList = Arrays.asList("Reflection","Collection","Stream"); 
  
    // demonstration of filter method 
    System.out.println("List of String before filtering : " + namesList);
    List<String> filterNameList = namesList.stream().filter(s->s.startsWith("S")).collect(Collectors.toList()); 
    System.out.println("Result of using filter() method for string starting with S : " + filterNameList + "\n"); 
  
    //Demonstration of sorted method.
    //It will be sorting based on the natural order.
    System.out.println("List of String before sorting : " + namesList);
    List<String> sortedStrList = namesList.stream().sorted().collect(Collectors.toList()); 
    System.out.println("List of String after sorting : " + sortedStrList + "\n"); 
  
    System.out.println("List of Integer before sorting : " + numberList);
    List<Integer> sortedIntList = numberList.stream().sorted().collect(Collectors.toList()); 
    System.out.println("List of String after sorting : " + sortedIntList + "\n"); 
    
    // create a list of integers 
    List<Integer> numbers = Arrays.asList(2,3,4,5,2); 
  
    System.out.println("Number of list to be put in set as Square : " + numbers);
    // collect method returns a set 
    Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet()); 
    System.out.println("Square number in Set collection of number List using collect: " + squareSet + "\n"); 
  
    System.out.println("Number List given as in input to forEach() : " + numberList);
    // demonstration of forEach method 
    System.out.print("Print square of number List using forEach() : [" );
    numberList.stream().map(x->x*x).forEach(y->System.out.print(y+ ", ")); 
    System.out.print("]");
    System.out.println("\n");
    
    // demonstration of reduce method 
    System.out.println("Number list before giving to reduce() " + numberList);
    int even = numberList.stream().filter(x->x%2==0).reduce(0,(ans,i)-> {
    		System.out.println("ans : " + ans + " i : " + i);
    		return (ans+i);
    	}); 
    System.out.println("Printing result number list using reduce() " + even); 
    
  } 
} 
