package assignmentmonday;

import java.util.*;

public class Reversekey {
	public static void main(String[] args) {
	TreeMap<Integer,String> tr= new TreeMap<>();
	tr.put(1,"Vivek");
	tr.put(2,"Vansh");
	tr.put(3,"Priyanshu");
	tr.put(4,"Prashant");
	tr.put(5,"Dipayan");
	tr.put(6,"Raghu");
	tr.put(7,"Harsh");
	
	System.out.println("The tree is "+tr);
	System.out.println("The reverse tree is "+tr.descendingKeySet());
	}
}