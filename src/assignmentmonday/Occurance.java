package assignmentmonday;

import java.util.*;
public class Occurance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array = new ArrayList<String>();
		array.add("Vivek");
		array.add("Vansh");
		array.add("Priyanshu");
		array.add("Prashant");
		array.add("Raghu");
		array.add("Harsh");
		array.add("dipayan");
		array.add("Vivek");
		array.add("Vansh");
		array.add("Priyanshu");
		array.add("Prashant");
		array.add("Raghu");
		array.add("Harsh");
		array.add("dipayan");
		
		System.out.println("Original: "+array);
		Scanner occur = new Scanner(System.in);
		System.out.println("Enter name whose first and last occurrence is to be found ");
		String el=occur.next();
		int fi=array.indexOf(el);
		int li= array.lastIndexOf(el);
		System.out.println("Fisrt occurrence at "+fi+" and the last occurrence at "+li);

	}
}



		
		