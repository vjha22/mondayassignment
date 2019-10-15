package assignmentmonday;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Keystrict {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tr= new TreeMap<>();
		tr.put(1,"Vivek");
		tr.put(2,"Vansh");
		tr.put(3,"Priyanshu");
		tr.put(4,"Prashant");
		tr.put(5,"Dipayan");
		tr.put(6,"Raghu");
		tr.put(7,"Harsh");
		System.out.println("The tree map 1: "+tr);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Key to check for smaller keys");
		int k = s.nextInt();
		System.out.println("The element with keys smaller than "+k+" are "+tr.headMap(k));
	}
}